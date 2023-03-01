import java.util.Random;

public class CalculationUtils {

    public static int findRandomNumber(int n){
        return new Random().nextInt(1 * n, 9 * n + n - 1);
    }

    public static void findAreaOfACircle(int r){
        System.out.println("Площадь круга c радиусом "+ r + " равна " + (Math.PI * Math.pow(r, 2)));
    }

    public static void calculate(int number1, int number2, String symbol) {
        switch (symbol){
            case ("+") : {
                System.out.println(number1 + number2);
            }
            case ("-") : {
                System.out.println(number1 - number2);
            }
            case ("*") : {
                System.out.println(number1 * number2);
            }
            case ("/") : {
                System.out.println((double) number1 / number2);
            }
        }
    }
}
