public class StudentDemo27 {
    public static void main(String[] args) {
        TopStudent27 topStudent = new TopStudent27(5);

        topStudent.add(new Student27("2201", "Alice", "A", 3.9));
        topStudent.add(new Student27("2202", "Bob", "B", 3.7));
        topStudent.add(new Student27("2203", "Charlie", "C", 3.8));
        topStudent.add(new Student27("2204", "David", "D", 3.6));
        topStudent.add(new Student27("2205", "Eve", "E", 4.0));

        System.out.println("Original student list: ");
        topStudent.print();

        topStudent.bubbleSort();
        System.out.println("Sorted student list (by GPA, descending): ");
        topStudent.print();

        topStudent.selectionSort();
        System.out.println("Sorted student list (by GPA, ascending) using Selection Sort: ");
        topStudent.print();

        topStudent.insertionSort();
        System.out.println("Sorted student list (by GPA, ascending) using Insertion Sort: ");
        topStudent.print();

        topStudent.selectionSort();
        System.out.println("Sorted student list (by GPA, descending) using Selection Sort: ");
        topStudent.print();
    }
}
