package houmvork.lesson.six;
import java.util.Comparator;

public class Sorted implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        Integer num1;
        Integer num2;
        num1 = o1;
        num2 = o2;
        return num2.compareTo(num1);
    }
}
