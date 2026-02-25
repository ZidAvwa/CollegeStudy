public class DoubleLinkedLists {
    Node head;
    Node tail;

    DoubleLinkedLists() {
        head = null;
        tail = null;
    }

    boolean isEmpty() {
        return head == null;
    }

    void addFirst(Student data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    void addLast(Student data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    void insertAfter(String key, Student data) {
        Node newNode = new Node(data);
        Node temp = head;
        while (temp != null) {
            if (temp.data.nim.equalsIgnoreCase(key)) {
                if (temp == tail) {
                    addLast(data);
                } else {
                    newNode.next = temp.next;
                    newNode.prev = temp;
                    temp.next.prev = newNode;
                    temp.next = newNode;
                }
            }
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Insertion failed. Data (" + key + ") not found!!");
        }
    }

    void removeFirst() {
        if (isEmpty()) {
            System.out.println("Double linked list is currently empty!!");
        } else if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
    }

    void removeLast() {
        if (isEmpty()) {
            System.out.println("Double linked list is currently empty!!");
        } else if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
    }

    void remove(int index) {
        if (isEmpty()) {
            System.out.println("Double linked list is currently empty!!");
        } else if (index < 0) {
            System.out.println("Index cannot be negative!");
        } else if (index == 0) {
            removeFirst();
        } else {
            Node temp = head;
            for (int i = 0; i < index; i++) {
                if (temp == null) {
                    System.out.println("Index out of bounds!");
                    return;
                }
                temp = temp.next;
            }
            if (temp == null) {
                System.out.println("Index out of bounds!");
            } else if (temp == tail) {
                removeLast();
            } else {
                temp.prev.next = temp.next;
                temp.next.prev = temp.prev;
            }
        }
    }

    void add(int index, Student data) {
        if (index < 0) {
            System.out.println("Index cannot be negative!");
            return;
        }
        if (index == 0) {
            addFirst(data);
            return;
        }
        Node temp = head;
        for (int i = 0; i < index - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null || temp == tail) {
            addLast(data);
        } else {
            Node newNode = new Node(data);
            newNode.next = temp.next;
            newNode.prev = temp;
            temp.next.prev = newNode;
            temp.next = newNode;
        }
    }

    void removeAfter(String key) {
        Node temp = head;
        while (temp != null && !temp.data.nim.equalsIgnoreCase(key)) {
            temp = temp.next;
        }
        if (temp != null && temp.next != null) {
            Node toRemove = temp.next;
            if (toRemove == tail) {
                removeLast();
            } else {
                temp.next = toRemove.next;
                toRemove.next.prev = temp;
            }
        } else {
            System.out.println("No node found after key: " + key);
        }
    }

    Student getFirst() {
        return isEmpty() ? null : head.data;
    }

    Student getLast() {
        return isEmpty() ? null : tail.data;
    }

    Student getIndex(int index) {
        if (index < 0)
            return null;
        Node temp = head;
        for (int i = 0; i < index && temp != null; i++) {
            temp = temp.next;
        }
        return temp != null ? temp.data : null;
    }

    int getSize() {
        int size = 0;
        Node temp = head;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        return size;
    }

    int indexOf(String nim) {
        int index = 0;
        Node temp = head;
        while (temp != null) {
            if (temp.data.nim.equalsIgnoreCase(nim)) {
                return index;
            }
            temp = temp.next;
            index++;
        }
        return -1;
    }

    void print() {
        if (!isEmpty()) {
            Node temp = head;
            while (temp != null) {
                temp.data.print();
                temp = temp.next;
            }
            System.out.println();
        } else {
            System.out.println("Double linked list is currently empty!!");
        }
    }
}
