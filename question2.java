interface add{
    int addition(int num1,int num2);
}
public class question2 {
    public static void main(String[] args) {
        int a=10,b=20;
        add adder=(int num1,int num2)->num1+num2;
        System.out.println(adder.addition(a,b));
    }
}
