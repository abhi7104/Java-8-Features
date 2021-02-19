interface boolGreater<T>{
    boolean greater(T t1,T t2);
}
interface increment<T>{
    int incr(T num1);
}
interface concatination<T>{
    String concat(T s1,T s2);
}
interface toUpper<T>{
    String up(T str);
}
public class question1 {
    public static void main(String[] args) {
        int a=1,b=6,c=5;
        String str="my name is ",str1="abhishek";
        boolGreater<Integer> bg=(num1,num2)->num1>num2?true:false;
        increment<Integer> i=(x)->x+1;
        concatination<String> con=(s1,s2)->s1+s2;
        toUpper<String> tu=(stu)->stu.toUpperCase();
        System.out.println(bg.greater(a,b));
        System.out.println(i.incr(c));
        System.out.println(con.concat(str,str1));
        System.out.println(tu.up(str1));
    }
}
