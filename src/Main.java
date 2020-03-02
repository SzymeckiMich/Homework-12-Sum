import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
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
        Utils.allMethods(numbers);
    }
}
