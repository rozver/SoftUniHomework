import java.util.Scanner;

/**
 * Created by User on 7/8/2017.
 */
public class CelsiusToFarhenhreit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();

        double f = a*1.8 + 32;

        System.out.printf("%.2f", f);
    }
}
