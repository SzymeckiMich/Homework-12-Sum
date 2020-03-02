import java.util.ArrayList;
import java.util.List;

public class Utils {
    public static void reversePrint(ArrayList<Number> list) {
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i));
        }
    }

    public static void sumOfNumbers(ArrayList<Number> list) {
        double sum = 0;
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + "+");
            sum = (sum + (double) list.get(i));
        }
        System.out.println("=" + sum);
    }

    public static void minAndMax(ArrayList<Number> list) {
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

    public static void allMethods(ArrayList<Number> list) {
        reversePrint(list);
        sumOfNumbers(list);
        minAndMax(list);
    }

}
