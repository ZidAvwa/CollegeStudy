package Assignment;
public class QueueLinkedList {
    Node front, rear;
    int size;

    public QueueLinkedList() {
        front = rear = null;
        size = 0;
    }

    boolean isEmpty() {
        return front == null;
    }

    void clear() {
        front = rear = null;
        size = 0;
        System.out.println("Queue cleared.");
    }

    void enqueue(Student std) {
        Node newNode = new Node(std, null);
        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

    void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
        } else {
            System.out.println("Calling: ");
            front.data.print();
            front = front.next;
            if (front == null) {
                rear = null;
            }
            size--;
        }
    }

    void peekFront() {
        if (!isEmpty()) {
            System.out.print("Front: ");
            front.data.print();
        } else {
            System.out.println("Queue is empty!");
        }
    }

    void peekRear() {
        if (!isEmpty()) {
            System.out.print("Rear: ");
            rear.data.print();
        } else {
            System.out.println("Queue is empty!");
        }
    }

    void printQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
        } else {
            System.out.println("Queue contents:");
            Node temp = front;
            while (temp != null) {
                temp.data.print();
                temp = temp.next;
            }
        }
    }

    int size() {
        return size;
    }
}
