import java.util.List;

public class question11 {
    public static void main(String[] args) {
        List<Integer> l= List.of(1,2,3,4,5,6,7,8,9,10);
        System.out.println(l.stream().mapToInt(x->x*2).average());
    }
}
