import java.util.Scanner;

/**
 * Created by User on 7/26/2017.
 */
public class InvalidNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = Integer.parseInt(sc.nextLine());

        if(num>=100 && num<=200 || num==0) {

        }else {
            System.out.println("invalid");
        }
    }
}
