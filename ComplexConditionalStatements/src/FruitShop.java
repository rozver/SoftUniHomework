import java.util.Scanner;

/**
 * Created by User on 7/26/2017.
 */
public class FruitShop {
    public static void main(String[] args) {
        double total;

        Scanner sc = new Scanner(System.in);

        String fruit = sc.nextLine();
        String day = sc.nextLine();
        double amount = Double.parseDouble(sc.nextLine());

        if(day.equalsIgnoreCase("Sunday") || day.equalsIgnoreCase("Saturday")) {
            if(fruit.equals("banana")) {
                total = amount*2.70;
                System.out.println(total);
            }else if(fruit.equals("orange")) {
                total = amount*0.90;
                System.out.println(total);
            }else if(fruit.equals("apple")) {
                total = amount*1.25;
                System.out.println(total);
            }else if(fruit.equals("grapefruit")) {
                total = amount*1.60;
                System.out.println(total);
            }else if(fruit.equals("kiwi")) {
                total = amount*3.00;
                System.out.println(total);
            }else if(fruit.equals("pineapple")) {
                total = amount*5.60;
                System.out.println(total);
            }else if(fruit.equals("grapes")) {
                total = amount*4.20;
                System.out.println(total);
            }else {
                System.out.println("error");
            }
        }else if(day.equalsIgnoreCase("Monday") || day.equalsIgnoreCase("Tuesday") || day.equalsIgnoreCase("Wednesday") || day.equalsIgnoreCase("Thursday") || day.equalsIgnoreCase("Friday")){
            if(fruit.equals("banana")) {
                total = amount*2.50;
                System.out.println(total);
            }else if(fruit.equals("orange")) {
                total = amount*0.85;
                System.out.println(total);
            }else if(fruit.equals("apple")) {
                total = amount*1.20;
                System.out.println(total);
            }else if(fruit.equals("grapefruit")) {
                total = amount*1.45;
                System.out.println(total);
            }else if(fruit.equals("kiwi")) {
                total = amount*2.70;
                System.out.println(total);
            }else if(fruit.equals("pineapple")) {
                total = amount*5.50;
                System.out.println(total);
            }else if(fruit.equals("grapes")) {
                total = amount*3.85;
                System.out.println(total);
            }else {
                System.out.println("error");
            }
        }else {
            System.out.println("error");
        }
    }
}
