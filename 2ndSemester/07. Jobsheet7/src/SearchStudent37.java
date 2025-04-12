// public class SearchStudent37 {
//     Students27[] listStd = new Students27[5];
//     int idx; change this 3 lines into the next 8 lines

public class SearchStudent37 {
    Students27[] listStd;
    int idx;
    
    public SearchStudent37(int size) {
        listStd = new Students27[size];
    }

    public void add(Students27 std) {
        if (idx < listStd.length) {
            listStd[idx] = std;
            idx++;
        } else {
            System.out.println("Data is already full");
        }
    }

    public void display() {
        for (Students27 students : listStd) {
            students.display();
            System.out.println("--------------------------");
        }
    }

    public int findSeqSearch (int search){
        int position = -1;
        for (int i = 0; i < listStd.length; i++) {
            if (listStd[i].nim == search){
                position = i;
            }
        }
        return position;
    }

    public void showPosition (int x, int pos){
        if (pos != -1) {
            System.out.println("Data : " + x + " is found in index " + pos);
        }else{
            System.out.println("Data : " + x + " is not found");
        }
    }

    public void showData (int x, int pos){
        if (pos != -1) {
            System.out.println("NIM \t : " + x);
            System.out.println("Name : \t " + listStd[pos].name);
            System.out.println("Age : \t " + listStd[pos].age);
            System.out.println("GPA : \t " + listStd[pos].gpa);
        }else{
            System.out.println("Data : " + x + " is not found");
        }
    }

    public int FindBinarySearch(int search, int left, int right) {
        int mid = (left + right) / 2;
        if (left >= right) {
            mid = (left + right) / 2;
            if (search == listStd[mid].nim) {
                return mid;
            } else if (search < listStd[mid].nim) {
                return FindBinarySearch(search, left, mid - 1);
            } else {
                return FindBinarySearch(search, mid + 1, right);
            }
        }
        return -1;
    }
    // public int FindBinarySearch(int search, int left, int right) {
    //     if (left <= right) {
    //         int mid = (left + right) / 2;
    //         if (search == listStd[mid].nim) {
    //             return mid;
    //         } else if (search < listStd[mid].nim) {
    //             return FindBinarySearch(search, mid + 1, right); // Changed
    //         } else {
    //             return FindBinarySearch(search, left, mid - 1); // Changed
    //         }
    //     }
    //     return -1;
    // }
}
