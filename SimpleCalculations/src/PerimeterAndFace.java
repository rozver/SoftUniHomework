import java.util.Scanner;

/**
 * Created by User on 7/8/2017.
 */
public class PerimeterAndFace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double r = sc.nextDouble();

        double s = Math.PI * r * r;
        double p = Math.PI * r * 2;

        System.out.println("Area = " + s);
        System.out.println("Perimeter = " + p);
    }
}
