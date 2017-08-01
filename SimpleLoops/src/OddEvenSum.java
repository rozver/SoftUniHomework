import java.util.Scanner;

/**
 * Created by User on 7/30/2017.
 */
public class OddEvenSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int j;
        int sum1 = 0;
        int sum2 = 0;
        int n = Integer.parseInt(sc.nextLine());

        for(int i=1; i<=n; i++) {
            j = Integer.parseInt(sc.nextLine());

            if(i%2==0) {
                sum1+=j;
            }else {
                sum2+=j;
            }
        }

        if(sum1==sum2) {
            System.out.println("Yes sum = " + sum1);
        }else if(sum1>sum2) {
            int diff = sum1-sum2;
            System.out.println("No diff = " + diff);
        }else {
            int diff = sum2-sum1;
            System.out.println("No diff = " + diff);
        }

    }
}
