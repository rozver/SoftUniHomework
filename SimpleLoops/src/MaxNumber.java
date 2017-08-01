import java.util.Scanner;

/**
 * Created by User on 7/30/2017.
 */
public class MaxNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        int j = Integer.parseInt(sc.nextLine());
        int max = j;

        for(int i=1; i<n; i++) {
            j = Integer.parseInt(sc.nextLine());
            if(j>max) {
                max = j;
            }
        }

        System.out.println(max);

    }
}
