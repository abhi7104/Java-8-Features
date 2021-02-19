interface sample1{
    default void display(){
        System.out.println("default interface");
    }
}
public class question7 implements sample1 {
    public void display(){
        System.out.println("Overloaded interface");
    }
    public static void main(String[] args) {
       question7 q= new question7();
       q.display();
    }
}
