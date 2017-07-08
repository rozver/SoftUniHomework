import java.util.Scanner;

/**
 * Created by User on 7/8/2017.
 */
public class USDToBGN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double usd = sc.nextDouble();

        double bgn = usd*1.79549;

        System.out.printf("%.2f BGN", bgn);
    }
}
