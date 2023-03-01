import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        //Task 1
//        Scanner scanner = new Scanner(System.in);
//        double a = scanner.nextDouble();
//        double b = scanner.nextDouble();
//        double c = scanner.nextDouble();
//        QuadraticEquation.printRoots(a, b, c);
//
//        //Task 2
//        NewsPage.countNumberOfPages(49);
//
//        //Task 3
//        System.out.println(CalculationUtils.findRandomNumber(10));
//
//        //Task 4
//        CalculationUtils.findAreaOfACircle(3);
//
//        //Task 6
//        Scanner scannerName = new Scanner(System.in);
//        String name = scannerName.next();
//        System.out.println("Hello, " + name);

        //Task 7
        Scanner scanner2 = new Scanner(System.in);
        int number1 = scanner2.nextInt();
        int number2 = scanner2.nextInt();
        String symbol = scanner2.next();
        CalculationUtils.calculate(number1, number2, symbol);
    }
}
