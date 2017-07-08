import java.util.Scanner;

/**
 * Created by User on 7/8/2017.
 */
public class GreetingsByName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nm = sc.nextLine();

        System.out.println("Hello, " + nm + "!");
    }
}
