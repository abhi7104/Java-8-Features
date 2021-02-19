import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
interface sample{
    Consumer<Integer> c=x->System.out.println(x);
    Supplier<Double> s=()->Math.random();
    Predicate<Integer>p=x->x%2==0;
    Function<Integer,Integer> f=x->x*x;

}
public class question5 {
    public static void main(String[] args) {
        System.out.println(sample.s.get());
        List<Integer> num=List.of(2,32,4,65,56,3);
        num.stream().filter(sample.p).map(sample.f).forEach(sample.c);
    }
}
