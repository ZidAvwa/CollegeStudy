public class SortMain27 {
    public static void main(String[] args) {
        int[] data = {10, 40, 30, 50, 70, 20, 100, 90};
        System.out.println("Sorting with merge sort");
        System.out.println("Initial Data");
        for (int num : data) {
            System.out.print(num + " ");
        }

        MergeSort27 sorter = new MergeSort27();
        sorter.mergeSort(data);

        System.out.println("\nSorted Data");
        for (int num : data) {
            System.out.print(num + " ");
        }
    }
}
