interface inter{
    default void displayinter(){
        System.out.println("Default from interface");
    }
}

interface  inter1{
    default void displayinter1(){
        System.out.println("Default from interface1");
    }
}
public class question8 implements inter,inter1 {
    public static void main(String[] args) {
        question8 q=new question8();
        q.displayinter();
        q.displayinter1();

    }
}
