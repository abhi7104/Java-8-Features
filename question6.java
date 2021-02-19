interface ques{
    public default void print(){
        System.out.println("Default method");
    }
    public static void staticprint(){
        System.out.println("Static method");
    }
        }

public class question6 implements ques {
    public static void main(String[] args) {
        question6 q=new question6();
        q.print();
        ques.staticprint();
    }
}
