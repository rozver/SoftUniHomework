import java.util.Scanner;

/**
 * Created by User on 7/30/2017.
 */
public class LeftAndRightSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int j;
        int sum1 = 0;
        int sum2 = 0;
        int n = Integer.parseInt(sc.nextLine());

        for(int i=0; i<n; i++) {
            j = Integer.parseInt(sc.nextLine());
            sum1+=j;
        }

        for(int f=0; f<n; f++) {
            j = Integer.parseInt(sc.nextLine());
            sum2+=j;
        }

        if(sum1==sum2) {
            System.out.println("Yes, sum = " + sum1);
        }else if(sum1>sum2) {
            int diff = sum1-sum2;
            System.out.println("No, diff = " + diff);
        }else {
            int diff = sum2-sum1;
            System.out.println("No, diff = " + diff);
        }
    }
}
