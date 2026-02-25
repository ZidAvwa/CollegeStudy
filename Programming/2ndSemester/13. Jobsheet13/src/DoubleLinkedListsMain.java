public class DoubleLinkedListsMain {
    public static void main(String[] args) {
        DoubleLinkedLists dll = new DoubleLinkedLists();

        System.out.println(">>> Initial List:");
        dll.addFirst(new Student("111", "Anton", "TI-1I", 3.57));
        dll.addLast(new Student("112", "Prabowo", "TI-1I", 3.7));
        dll.addLast(new Student("113", "Herco", "TI-1I", 3.89));
        dll.print();

        System.out.println(">>> Add at index 1 (insert Rizki):");
        dll.add(1, new Student("114", "Rizki", "TI-1I", 3.8));
        dll.print();

        System.out.println(">>> Remove after nim 112 (remove Herco):");
        dll.removeAfter("112");
        dll.print();

        System.out.println(">>> Get first student:");
        Student first = dll.getFirst();
        if (first != null) first.print();

        System.out.println(">>> Get last student:");
        Student last = dll.getLast();
        if (last != null) last.print();

        System.out.println(">>> Get student at index 1:");
        Student s = dll.getIndex(1);
        if (s != null) s.print();

        System.out.println(">>> Get size of list:");
        System.out.println("Size: " + dll.getSize());

        System.out.println(">>> Find index of student with NIM 114:");
        System.out.println("Index of 114: " + dll.indexOf("114"));

        System.out.println(">>> Find index of student with NIM 999 (not found):");
        System.out.println("Index of 999: " + dll.indexOf("999"));
    }
}
