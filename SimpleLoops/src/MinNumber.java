/**
 * Created by User on 7/30/2017.
 */

import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        int j = Integer.parseInt(sc.nextLine());
        int min = j;

        for(int i=1; i<n; i++) {
            j = Integer.parseInt(sc.nextLine());
            if(j<min) {
                min = j;
            }
        }

        System.out.println(min);
    }
}
