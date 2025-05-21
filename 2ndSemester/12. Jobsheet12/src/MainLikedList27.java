public class MainLikedList27 {
    public static void main(String[] args) {
        SingleLinkedList sll = new SingleLinkedList();
        Student27 std1 = new Student27("001", "Student27 1", "TI-1I", 3.89);
        Student27 std2 = new Student27("002", "Student27 2", "TI-1I", 3.45);
        Student27 std3 = new Student27("003", "Student27 3", "TI-1I", 3.20);
        Student27 std4 = new Student27("004", "Student27 4", "TI-1I", 3.00);

        sll.print();
        sll.addFirst(std4);
        sll.print();
        sll.addLast(std1);
        sll.print();
        sll.insertAfter(std3, "Student 4");
        sll.insertAt(2, std2);
        sll.print();

        System.out.println("Data at index 1 is:");
        Student27 data = sll.getData(1);
        data.print();
        int idx = sll.indexOf("Student 1");
        System.out.println("Student 1 is located at index: " + idx);
        sll.removeFirst();
        sll.removeLast();
        sll.print();
        sll.removeAt(0);
        sll.print();

    }

}
