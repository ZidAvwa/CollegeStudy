public class LecturerData27 {
    Lecturer27[] lecturerData;
    int idx;

    public LecturerData27() {
        lecturerData = new Lecturer27[10];
        idx = 0;
    }

    public void add(Lecturer27 dsn) {
        if (idx < lecturerData.length) {
            lecturerData[idx] = dsn;
            idx++;
        } else {
            System.out.println("List is Full!");
        }
    }

    public void print() {
        for (int i = 0; i < idx; i++) {
            lecturerData[i].print();
        }
    }

    public void sortingASC() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - 1 - i; j++) {
                if (lecturerData[j].age > lecturerData[j + 1].age) {
                    Lecturer27 temp = lecturerData[j];
                    lecturerData[j] = lecturerData[j + 1];
                    lecturerData[j + 1] = temp;
                }
            }
        }
    }

    public void sortingDSC() {
        for (int i = 0; i < idx - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < idx; j++) {
                if (lecturerData[j].age > lecturerData[maxIndex].age) {
                    maxIndex = j;
                }
            }
            Lecturer27 temp = lecturerData[maxIndex];
            lecturerData[maxIndex] = lecturerData[i];
            lecturerData[i] = temp;
        }
    }

    public void sequentialSearch(String searchName) {
        int count = 0;
        for (int i = 0; i < idx; i++) {
            if (lecturerData[i].name.equalsIgnoreCase(searchName)) {
                lecturerData[i].print();
                count++;
            }
        }

        if (count == 0) {
            System.out.println("Lecturer with name \"" + searchName + "\" not found.");
        } else if (count > 1) {
            System.out.println("Warning: Multiple lecturers found with the name \"" + searchName + "\".");
        }
    }

    public void binarySearch(int targetAge) {
        sortingASC(); // sort before binary search
        int left = 0, right = idx - 1;
        int foundIndex = -1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (lecturerData[mid].age == targetAge) {
                foundIndex = mid;
                break;
            } else if (lecturerData[mid].age < targetAge) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        if (foundIndex == -1) {
            System.out.println("Lecturer with age " + targetAge + " not found.");
            return;
        }

        // Scan for all matches
        int count = 1;
        int i = foundIndex - 1;
        while (i >= 0 && lecturerData[i].age == targetAge) {
            i--;
            count++;
        }
        int j = foundIndex + 1;
        while (j < idx && lecturerData[j].age == targetAge) {
            j++;
            count++;
        }

        for (int k = i + 1; k < j; k++) {
            lecturerData[k].print();
        }

        if (count > 1) {
            System.out.println("Warning: Multiple lecturers found with the age " + targetAge + ".");
        }
    }
}
