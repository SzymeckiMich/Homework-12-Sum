import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Utils {

    public static ArrayList<Number> createAndFillList() {
        ArrayList<Number> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("Podaj wartość: ");
            double number = scanner.nextDouble();
            if (number > 0) {
                numbers.add(number);
            } else {
                flag = false;
            }
        }
        return numbers;
    }

    public static void printReverseList(List<Number> list) {
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i));
        }
    }

    public static void printSumOfNumbers(List<Number> list) {
        double sum = 0;
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + "+");
            sum = (sum + (double) list.get(i));
        }
        System.out.println("=" + sum);
    }

    public static void printMinAndMax(List<Number> list) {
        double min = (double) list.get(0);
        double max = (double) list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if ((double) list.get(i) > max) {
                max = (double) list.get(i);
            } else if ((double) list.get(i) < min) {
                min = (double) list.get(i);
            }
        }
        System.out.println("Min = " + min + ", Max = " + max);
    }
}
