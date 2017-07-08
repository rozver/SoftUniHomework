import java.util.Scanner;

/**
 * Created by User on 7/8/2017.
 */
public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double money = Double.parseDouble(sc.nextLine());
        String n1 =sc.nextLine();
        String n2 = sc.nextLine();

        switch (n1) {
            case "EUR":
                convertEuro(money, n2);
                break;
            case "BGN":
                convertBGN(money, n2);
                break;
            case "USD":
                convertUSD(money, n2);
                break;
            case "GBP":
                convertGBP(money, n2);
                break;
        }


    }
    public static void convertEuro(double n, String n2) {
        switch(n2) {
            case "GBP":
                double s = n*1.95583/2.53405;
                System.out.printf("%.2f", s);
                break;
            case "BGN":
                double d = n*1.95583 ;
                System.out.printf("%.2f", d);
                break;
            case "USD":
                double b = n*1.95583/1.79549;
                System.out.printf("%.2f", b);
                break;

        }
    }

    public static void convertBGN(double n, String n2) {
        switch(n2) {
            case "GBP":
                double s = n/2.53405 ;
                System.out.printf("%.2f GBP", s);
                break;
            case "EUR":
                double d = n/1.95583;
                System.out.printf("%.2f EUR", d);
                break;
            case "USD":
                double b = n/1.79549 ;
                System.out.printf("%.2f USD", b);
                break;

        }

    }

    public static void convertUSD(double n, String n2) {
        switch(n2) {
            case "GBP":
                double b = n*1.79549/2.53405;
                System.out.printf("%.2f GBP", b);
                break;
            case "BGN":
                double d = n*1.79549 ;
                System.out.printf("%.2f BGN", d);
                break;
            case "EUR":
                double s = n*1.79549/1.95583;
                System.out.printf("%.2f EUR", s);
                break;

        }

    }
    public static void convertGBP(double n, String n2) {
        switch(n2) {
            case "EUR":
                double b = n*2.53405/1.95583;
                System.out.printf("%.2f", b);
                break;
            case "BGN":
                double s = n*2.53405;
                System.out.printf("%.2f", s);
                break;
            case "USD":
                double d = n*2.53405/1.79549;
                System.out.printf("%.2f", d);
                break;

        }

    }
}
