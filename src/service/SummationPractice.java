import java.util.ArrayList;
import java.util.List;

public class SummationPractice {
    public static int summation(List<Integer> numbers) {
        int sum = 0;
        for (int number : numbers) {

            sum += number;

            System.out.println(sum + "\n+");
        }

        return sum;
    }

    public static void main(String[] args) {
        List<Integer> numbs = new ArrayList<Integer>();
        numbs.add(10);
        numbs.add(15);
        numbs.add(20);
        numbs.add(25);
        System.out.println(summation(numbs));

    }

    ;


};




