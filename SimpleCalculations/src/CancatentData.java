import java.util.Scanner;

/**
 * Created by User on 7/8/2017.
 */
public class CancatentData {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String fn = sc.nextLine();
        String ln = sc.nextLine();
        int age = Integer.parseInt(sc.nextLine());
        String town = sc.nextLine();

        System.out.println("You are " + fn + " " + ln + ", a " + age + "-years old person from " + town + ".");
    }
}
