import java.util.Scanner;

/**
 * Created by User on 7/16/2017.
 */
public class ThreeEqualNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = Integer.parseInt(sc.nextLine());
        int num2 = Integer.parseInt(sc.nextLine());
        int num3 = Integer.parseInt(sc.nextLine());

        if(num1==num2 && num2==num3) {
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
    }
}
