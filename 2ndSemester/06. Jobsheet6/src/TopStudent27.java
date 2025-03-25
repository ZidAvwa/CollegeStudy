public class TopStudent27 {
    Student27[] listStudents;
    int idx;

    public TopStudent27(int size) {
        listStudents = new Student27[size];
        idx = 0;
    }

    public void add(Student27 student){
        if (idx < listStudents.length) {
            listStudents[idx] = student;
            idx++;
        } else {
            System.out.println("List is Full!");
        }
    }
    
    public void print(){
        for (int i = 0; i < idx; i++) {
            listStudents[i].print();
        }
    }

    public void bubbleSort(){
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - 1 - i; j++) {
                if (listStudents[j].gpa < listStudents[j + 1].gpa) {
                    Student27 temp = listStudents[j];
                    listStudents[j] = listStudents[j + 1];
                    listStudents[j + 1] = temp;
                }
            }
        }
    }

    public void selectionSort(){
        for (int i = 0; i < idx - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < idx; j++) {
                if (listStudents[j].gpa < listStudents[minIndex].gpa) {
                    minIndex = j;
                }
            }
            Student27 temp = listStudents[minIndex];
            listStudents[minIndex] = listStudents[i];
            listStudents[i] = temp;
        }
    }

    public void insertionSort(){
        for (int i = 1; i < idx; i++) {
            Student27 temp = listStudents[i];
            int j = i;
            while (j > 0 && listStudents[j - 1].gpa > temp.gpa) {
                listStudents[j] = listStudents[j - 1];
                j--;
            }
            listStudents[j] = temp;
        }
    }

    public void insertionSortDescending(){
        for (int i = 1; i < idx; i++) {
            Student27 temp = listStudents[i];
            int j = i;
            while (j > 0 && listStudents[j - 1].gpa < temp.gpa) {
                listStudents[j] = listStudents[j - 1];
                j--;
            }
            listStudents[j] = temp;
        }
    }
}
