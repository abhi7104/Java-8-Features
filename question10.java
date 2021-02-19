import java.util.List;

public class question10 {
    public static void main(String[] args) {
        List<Integer> l= List.of(1,2,3,4,5,6,7,8,9,10);
        int n=l.stream().filter(x->x>5).reduce(0,(x,y)->x+y);
        System.out.println(n);
    }
}
