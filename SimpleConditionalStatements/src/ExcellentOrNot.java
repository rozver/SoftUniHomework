import java.util.Scanner;

/**
 * Created by User on 7/16/2017.
 */
public class ExcellentOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double grade = Double.parseDouble(sc.nextLine());

        if(grade>=5.50) {
            System.out.println("Excellent!");
        }else {
            System.out.println("Not excellent.");
        }
    }
}
