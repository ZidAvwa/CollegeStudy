public class ExcuseLetterStack27 {
    ExcuseLetter27[] stack;
    int top, size;

    public ExcuseLetterStack27(int size) {
        this.size = size;
        this.stack = new ExcuseLetter27[size];
        this.top = -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(ExcuseLetter27 letter) {
        if (!isFull()) {
            top++;
            stack[top] = letter;
        } else {
            System.out.println("Stack is full!");
        }
    }

    public ExcuseLetter27 pop() {
        if (!isEmpty()) {
            ExcuseLetter27 letter = stack[top];
            top--;
            return letter;
        } else {
            System.out.println("No letters to process.");
            return null;
        }
    }

    public ExcuseLetter27 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("No letters to view.");
            return null;
        }
    }

    public ExcuseLetter27 searchByName(String name) {
        for (int i = top; i >= 0; i--) {
            if (stack[i].name.equalsIgnoreCase(name)) {
                return stack[i];
            }
        }
        return null;
    }

    public void printAll() {
        System.out.println("ID\tName\tClass\tType\tDuration");
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i].id + "\t" + stack[i].name + "\t" + stack[i].className + "\t" + stack[i].typeOfExcuse + "\t" + stack[i].duration);
        }
    }
}
