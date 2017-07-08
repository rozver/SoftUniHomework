import java.util.Scanner;

/**
 * Created by User on 7/8/2017.
 */
public class TrapeziodArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double h = sc.nextDouble();

        double s = ((a+b)*h)/2;

        System.out.println("Trapezoid area = " + s);
    }
}
