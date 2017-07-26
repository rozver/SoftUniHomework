import java.util.Scanner;

/**
 * Created by User on 7/26/2017.
 */
public class PersonalTitles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double age = Double.parseDouble(sc.nextLine());
        String gender = sc.nextLine();

        if(age<16) {
            if(gender.equals("m")) {
                System.out.println("Master");
            }else if(gender.equals("f")) {
                System.out.println("Miss");
            }
        }else {
            if(gender.equals("m")) {
                System.out.println("Mr.");
            }else if(gender.equals("f")) {
                System.out.println("Ms.");
            }
        }
    }
}
