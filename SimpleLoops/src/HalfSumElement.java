import java.util.Scanner;

/**
 * Created by User on 7/30/2017.
 */
public class HalfSumElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int j;
        int sum = 0;
        int n = Integer.parseInt(sc.nextLine());
        int max = Integer.parseInt(sc.nextLine());

        sum+=max;

        for(int i=1; i<n; i++) {
            j = Integer.parseInt(sc.nextLine());
            sum+=j;
            if(j>max) {
                max = j;
            }
        }

        sum-=max;

        if(sum==max) {
            System.out.println("Yes sum = " + sum);
        }else {
            int diff = Math.abs(max-sum);
            System.out.println("No diff = " + diff);
        }

    }
}
