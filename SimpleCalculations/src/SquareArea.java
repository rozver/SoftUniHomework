import java.util.Scanner;

/**
 * Created by User on 7/8/2017.
 */
public class SquareArea {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("a = ");
        int a = sc.nextInt();

        a*=a;

        System.out.println("Square = " + a);

    }
}
