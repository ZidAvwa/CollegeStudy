from tensorflow.keras.models import load_model
import cv2
import numpy as np

# Disable scientific notation
np.set_printoptions(suppress=True)

# Load the model
model = load_model("/home/zid/catkin_ws/src/myrobot/scripts/keras_model.h5", compile=False)

# Load the labels
class_names = open("/home/zid/catkin_ws/src/myrobot/scripts/labels.txt", "r").readlines()

# Open the camera
camera = cv2.VideoCapture(2)

while True:
    ret, frame = camera.read()
    
    if not ret:
        print("Failed to grab frame")
        break

    # Copy the frame for display
    display_frame = frame.copy()

    # Resize for model input
    image_resized = cv2.resize(frame, (224, 224), interpolation=cv2.INTER_AREA)
    image_array = np.asarray(image_resized, dtype=np.float32).reshape(1, 224, 224, 3)
    image_array = (image_array / 127.5) - 1

    # Model prediction
    prediction = model.predict(image_array)
    index = np.argmax(prediction)
    class_name = class_names[index].strip()
    confidence_score = prediction[0][index] * 100

    # Convert image to grayscale
    gray = cv2.cvtColor(frame, cv2.COLOR_BGR2GRAY)

    # Apply threshold to detect objects
    _, thresh = cv2.threshold(gray, 150, 255, cv2.THRESH_BINARY)

    # Find contours
    contours, _ = cv2.findContours(thresh, cv2.RETR_EXTERNAL, cv2.CHAIN_APPROX_SIMPLE)

    if contours:
        # Find the largest contour (assuming the object is the biggest feature)
        largest_contour = max(contours, key=cv2.contourArea)

        # Get bounding box around the object
        x, y, w, h = cv2.boundingRect(largest_contour)

        # Draw the bounding box
        cv2.rectangle(display_frame, (x, y), (x + w, y + h), (0, 255, 0), 2)

        # Display object coordinates
        label = f"{class_name}: {confidence_score:.2f}% | X:{x}, Y:{y}, W:{w}, H:{h}"
        cv2.putText(display_frame, label, (x, y - 10), cv2.FONT_HERSHEY_SIMPLEX, 0.7, (0, 255, 0), 2)

        # Print coordinates in terminal
        print(f"Detected {class_name} at X:{x}, Y:{y}, Width:{w}, Height:{h}")

    # Show image
    cv2.imshow("Webcam Image", display_frame)

    # Exit on 'Esc' key
    if cv2.waitKey(1) == 27:
        break

# Cleanup
camera.release()
cv2.destroyAllWindows()
