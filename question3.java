interface multiply{
    int mult(int num1,int num2);
}
interface additi{
    int add(int num1,int num2);
}
interface subtra{
    int sub(int num1,int num2);
}
public class question3 {
    public  static int multiplication(int num1,int num2)
    {
        return num1*num2;
    }
    public int addition(int num1,int num2)
    {
        return num1+num2;
    }
    public int subtraction(int num1,int num2)
    {
        return num1-num2;
    }
    public static void main(String[] args) {
        multiply m= question3::multiplication;//static method reference
        question3 q3= new question3();
        additi ad=q3::addition;//instance method reference
        subtra sb=q3::subtraction;//instance method reference
        System.out.println(ad.add(5,8));
        System.out.println(sb.sub(5,1));
        System.out.println(m.mult(4,5));

    }
}
