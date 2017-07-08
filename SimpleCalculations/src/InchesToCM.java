import java.util.Scanner;

/**
 * Created by User on 7/8/2017.
 */
public class InchesToCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("inches: ");

        double s = sc.nextDouble();

        s*=2.54;

        System.out.println("centimeters = " + s);
    }
}
