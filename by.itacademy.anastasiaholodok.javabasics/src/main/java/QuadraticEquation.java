public class QuadraticEquation {

    public static void printRoots(double a, double b, double c) {
        double d = (b * b) - (4 * a * c);
        if (d > 0) {
            System.out.println((((-b) + Math.sqrt(d)) / (2 * a)) + " " +
                    (((-b) - Math.sqrt(d)) / (2 * a)));
        } else if (d == 0) {
            System.out.println((-b) / 2 * a);
        } else {
            System.out.println("no roots");
        }
    }

}
