import java.util.Scanner;

/**
 * Created by User on 7/30/2017.
 */
public class SumNumbers {
    public static void main(String[] args) {
        int sum = 0;

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int j;

        for(int i=1; i<=n; i++) {
            j = Integer.parseInt(sc.nextLine());
            sum+=j;
        }

        System.out.println(sum);
    }
}
