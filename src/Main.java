import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Number> numbers = Utils.createAndFillList();

        Utils.printReverseList(numbers);

        Utils.printSumOfNumbers(numbers);

        Utils.printMinAndMax(numbers);

    }
}
