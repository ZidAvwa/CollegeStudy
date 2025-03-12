public class ScoreAnalysis27 {
    String name[] = {"Ahmad", "Budi", "Cindy", "Dian", "Eko", "Fajar", "Gina", "Hadi"};
    int NIM[] = {220101001, 220101002, 220101003, 220101004, 220101005, 220101006, 220101007, 220101008};
    int year[] = {2022, 2022, 2021, 2021, 2023, 2020, 2023, 2020};
    int UTS[] = {78, 85, 90, 76, 92, 88, 80, 82};
    int UAS[] = {82, 88, 87, 79, 95, 85, 83, 84};

    int findMaxDC(int arr[], int l, int r) {
        if (l == r) return arr[l];

        int mid = (l + r) / 2;
        int leftMax = findMaxDC(arr, l, mid);
        int rightMax = findMaxDC(arr, mid + 1, r);
        return Math.max(leftMax, rightMax);
    }

    int findMinDC(int arr[], int l, int r) {
        if (l == r) return arr[l];

        int mid = (l + r) / 2;
        int leftMin = findMinDC(arr, l, mid);
        int rightMin = findMinDC(arr, mid + 1, r);
        return Math.min(leftMin, rightMin);
    }

    double calculateAverageBF(int arr[]) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum / arr.length;
    }
}
