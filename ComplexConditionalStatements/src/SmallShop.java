import java.util.Scanner;

/**
 * Created by User on 7/26/2017.
 */
public class SmallShop {
    public static void main(String[] args) {
        double totalPrice;

        Scanner sc = new Scanner(System.in);

        String product = sc.nextLine();
        String town = sc.nextLine();

        double amount = Double.parseDouble(sc.nextLine());

        if(town.equalsIgnoreCase("sofia")) {
            if(product.equalsIgnoreCase("coffee")) {
                totalPrice = amount*0.50;
                System.out.println(totalPrice);
            }else if(product.equalsIgnoreCase("water")) {
                totalPrice = amount*0.80;
                System.out.println(totalPrice);
            }else if(product.equalsIgnoreCase("beer")) {
                totalPrice = amount*1.20;
                System.out.println(totalPrice);
            }else if(product.equalsIgnoreCase("sweets")) {
                totalPrice = amount*1.45;
                System.out.println(totalPrice);
            }else if(product.equalsIgnoreCase("peanuts")) {
                totalPrice = amount*1.60;
                System.out.println(totalPrice);
            }
        }else if(town.equalsIgnoreCase("plovdiv")) {
            if(product.equalsIgnoreCase("coffee")) {
                totalPrice = amount*0.40;
                System.out.println(totalPrice);
            }else if(product.equalsIgnoreCase("water")) {
                totalPrice = amount*0.70;
                System.out.println(totalPrice);
            }else if(product.equalsIgnoreCase("beer")) {
                totalPrice = amount*1.15;
                System.out.println(totalPrice);
            }else if(product.equalsIgnoreCase("sweets")) {
                totalPrice = amount*1.30;
                System.out.println(totalPrice);
            }else if(product.equalsIgnoreCase("peanuts")) {
                totalPrice = amount*1.50;
                System.out.println(totalPrice);
            }
        }else if(town.equalsIgnoreCase("varna")) {
            if(product.equalsIgnoreCase("coffee")) {
                totalPrice = amount*0.45;
                System.out.println(totalPrice);
            }else if(product.equalsIgnoreCase("water")) {
                totalPrice = amount*0.70;
                System.out.println(totalPrice);
            }else if(product.equalsIgnoreCase("beer")) {
                totalPrice = amount*1.10;
                System.out.println(totalPrice);
            }else if(product.equalsIgnoreCase("sweets")) {
                totalPrice = amount*1.35;
                System.out.println(totalPrice);
            }else if(product.equalsIgnoreCase("peanuts")) {
                totalPrice = amount*1.55;
                System.out.println(totalPrice);
            }
        }
    }
}
