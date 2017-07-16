import java.util.Scanner;

/**
 * Created by User on 7/16/2017.
 */
public class EqualWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word1 = sc.nextLine();
        String word2 = sc.nextLine();

        if(word1.equalsIgnoreCase(word2)) {
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
    }
}
