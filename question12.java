import java.util.List;

public class question12 {
    public static void main(String[] args) {
        List<Integer> l= List.of(1,2,3,4,5,6,7,8,9,10);
        System.out.println(l.stream().filter(x->x%2==0 & x>3).findFirst());
    }
}
