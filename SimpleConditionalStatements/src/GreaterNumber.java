import java.util.Scanner;

/**
 * Created by User on 7/16/2017.
 */
public class GreaterNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = Integer.parseInt(sc.nextLine());
        int b = Integer.parseInt(sc.nextLine());

        if(a>b) {
            System.out.println(a);
        }else {
            System.out.println(b);
        }
    }
}
