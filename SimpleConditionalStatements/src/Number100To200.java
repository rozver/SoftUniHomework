import java.util.Scanner;

/**
 * Created by User on 7/16/2017.
 */
public class Number100To200 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double num = Double.parseDouble(sc.nextLine());

        if(num<100) {
            System.out.println("Less than 100");
        }else if(num>=100 && num<=200) {
            System.out.println("Between 100 and 200");
        }else if(num>200) {
            System.out.println("Greater than 200");
        }
    }
}
