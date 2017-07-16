import java.util.Scanner;

/**
 * Created by User on 7/16/2017.
 */
public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = Integer.parseInt(sc.nextLine());

        boolean even = num%2==0;

        if(even) {
            System.out.println("even");
        }else {
            System.out.println("odd");
        }
    }
}
