import java.util.Scanner;

/**
 * Created by User on 7/8/2017.
 */
public class RadiansToDegrees {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double r = sc.nextDouble();

        double d = (r*180) / Math.PI;

        System.out.println((int)d);
    }
}
