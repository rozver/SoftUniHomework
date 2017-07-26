import java.util.Scanner;

/**
 * Created by User on 7/26/2017.
 */
public class FruitOrVegetable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String product = sc.nextLine();

        if(product.equals("banana") || product.equals("apple") || product.equals("kiwi") || product.equals("cherry") || product.equals("lemon") || product.equals("grapes")) {
            System.out.println("fruit");
        }else if(product.equals("tomato") || product.equals("cucumber") || product.equals("pepper") || product.equals("carrot")) {
            System.out.println("vegetable");
        }else {
            System.out.println("unknown");
        }
    }
}
