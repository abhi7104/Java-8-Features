import java.util.List;
import java.util.stream.Collectors;

public class question9 {
    public static void main(String[] args) {
        List<Integer> l= List.of(10,2,6,4,2,3,9,7,4,21,43,55,8);
        List<Integer> newlist=l.stream().filter(m->m%2==0).collect(Collectors.toList());
        System.out.println(newlist);

    }
}
