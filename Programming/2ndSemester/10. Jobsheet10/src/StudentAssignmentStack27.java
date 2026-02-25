public class StudentAssignmentStack27 {
    Student27[] stack;
    int top, size;

    public StudentAssignmentStack27(int size){
        this.size = size;
        top = -1;
        stack = new Student27[size];
    }

    public boolean isFull(){
        if(top == size - 1) return true;
        else return false;
    }

    public boolean isEmpty(){
        if(top == -1) return true;
        else return false;
    }

    public void push(Student27 std){
        if(!isFull()){
            top++;
            stack[top] = std;
        } else {
            System.out.println("Stack is already full!");
        }
    }

    public Student27 pop(){
        if(!isEmpty()){
            Student27 std = stack[top];
            top--;
            return std;
        } else {
            System.out.println("There is no data in Stack!!");
            return null;
        }
    }

    public Student27 peek(){
        if(!isEmpty()){
            return stack[top];
        } else {
            System.out.println("There is no data in Stack!!");
            return null;
        }
    }
    
    public Student27 getFirstStudent() {
        if (!isEmpty()) return stack[0];
        return null;
    }

    public String convertToBinary(int grade){
        ConversionStack27 stack = new ConversionStack27();
        while (grade > 0) {
            int mod = grade % 2;
            stack.push(mod);
            grade /= 2;
        }
        String binary = "";
        while (!stack.isEmpty()) {
            binary += stack.pop();
        }
        return binary;
    }

    public void print(){
        for(int i = 0; i <= top; i++){
            System.out.println(stack[i].nim + "\t" + stack[i].name + "\t" + stack[i].className + "\t" + stack[i].grade);
        }
        System.out.println("");
    }
}
