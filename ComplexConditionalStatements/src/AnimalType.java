import java.util.Scanner;

/**
 * Created by User on 7/26/2017.
 */
public class AnimalType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String animal = sc.nextLine();

        switch(animal) {
            case "dog":
                System.out.println("mammal");
                break;
            case "crocodile":
                System.out.println("reptile");
                break;
            case "tortoise":
                System.out.println("reptile");
                break;
            case "snake":
                System.out.println("reptile");
                break;
            default:
                System.out.println("unknown");
                break;
        }
    }
}
