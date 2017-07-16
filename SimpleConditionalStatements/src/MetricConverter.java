import java.util.Scanner;

/**
 * Created by User on 7/16/2017.
 */
public class MetricConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double num = Double.parseDouble(sc.nextLine());
        String from = sc.nextLine();
        String to = sc.nextLine();

        if(from.equals(to)) {
            System.out.println(num + " " + to);
        }



        switch(from) {
            case "m":
                switch(to) {
                    case "cm":
                        num*=100;
                        System.out.printf("%.8f cm", num);
                        break;
                    case "mi":
                        num*=0.000621371192;
                        System.out.printf("%.8f mi", num);
                        break;
                    case "in":
                        num*=39.3700787;
                        System.out.printf("%.8f in", num);
                        break;
                    case "km":
                        num*=0.001;
                        System.out.printf("%.8f km", num);
                        break;
                    case "ft":
                        num*=3.2808399;
                        System.out.printf("%.8f ft", num);
                        break;
                    case "yd":
                        num*=1.0936133;
                        System.out.printf("%.8f yd", num);
                        break;
                    case "mm":
                        num*=1000;
                        System.out.printf("%.8f mm", num);
                }
                break;
            case "mm":
                num/=1000;
                switch(to) {
                    case "cm":
                        num*=100;
                        System.out.printf("%.8f cm", num);
                        break;
                    case "mi":
                        num*=0.000621371192;
                        System.out.printf("%.8f mi", num);
                        break;
                    case "in":
                        num*=39.3700787;
                        System.out.printf("%.8f in", num);
                        break;
                    case "km":
                        num*=0.001;
                        System.out.printf("%.8f km", num);
                        break;
                    case "ft":
                        num*=3.2808399;
                        System.out.printf("%.8f ft", num);
                        break;
                    case "yd":
                        num*=1.0936133;
                        System.out.printf("%.8f yd", num);
                        break;
                    case "m":
                        System.out.printf("%.8f m", num);
                }
                break;
            case "cm":
                num/=100;
                switch(to) {
                    case "mm":
                        num*=1000;
                        System.out.printf("%.8f mm", num);
                        break;
                    case "mi":
                        num*=0.000621371192;
                        System.out.printf("%.8f mi", num);
                        break;
                    case "in":
                        num*=39.3700787;
                        System.out.printf("%.8f in", num);
                        break;
                    case "km":
                        num*=0.001;
                        System.out.printf("%.8f km", num);
                        break;
                    case "ft":
                        num*=3.2808399;
                        System.out.printf("%.8f ft", num);
                        break;
                    case "yd":
                        num*=1.0936133;
                        System.out.printf("%.8f yd", num);
                        break;
                    case "m":
                        System.out.printf("%.8f m", num);
                }
                break;
            case "mi":
                num/=0.000621371192;
                switch(to) {
                    case "cm":
                        num*=100;
                        System.out.printf("%.8f cm", num);
                        break;
                    case "mm":
                        num*=1000;
                        System.out.printf("%.8f mm", num);
                        break;
                    case "in":
                        num*=39.3700787;
                        System.out.printf("%.8f in", num);
                        break;
                    case "km":
                        num*=0.001;
                        System.out.printf("%.8f km", num);
                        break;
                    case "ft":
                        num*=3.2808399;
                        System.out.printf("%.8f ft", num);
                        break;
                    case "yd":
                        num*=1.0936133;
                        System.out.printf("%.8f yd", num);
                        break;
                    case "m":
                        System.out.printf("%.8f m", num);
                }
                break;
            case "in":
                num/=39.3700787;
                switch(to) {
                    case "cm":
                        num*=100;
                        System.out.printf("%.8f cm", num);
                        break;
                    case "mi":
                        num*=0.000621371192;
                        System.out.printf("%.8f mi", num);
                        break;
                    case "mm":
                        num*=1000;
                        System.out.printf("%.8f mm", num);
                        break;
                    case "km":
                        num*=0.001;
                        System.out.printf("%.8f km", num);
                        break;
                    case "ft":
                        num*=3.2808399;
                        System.out.printf("%.8f ft", num);
                        break;
                    case "yd":
                        num*=1.0936133;
                        System.out.printf("%.8f yd", num);
                        break;
                    case "m":
                        System.out.printf("%.8f m", num);
                }
                break;
            case "km":
                num/=0.001;
                switch(to) {
                    case "cm":
                        num*=100;
                        System.out.printf("%.8f cm", num);
                        break;
                    case "mi":
                        num*=0.000621371192;
                        System.out.printf("%.8f mi", num);
                        break;
                    case "in":
                        num*=39.3700787;
                        System.out.printf("%.8f in", num);
                        break;
                    case "mm":
                        num*=1000;
                        System.out.printf("%.8f mm", num);
                        break;
                    case "ft":
                        num*=3.2808399;
                        System.out.printf("%.8f ft", num);
                        break;
                    case "yd":
                        num*=1.0936133;
                        System.out.printf("%.8f yd", num);
                        break;
                    case "m":
                        System.out.printf("%.8f m", num);
                }
                break;
            case "ft":
                num/=3.2808399;
                switch(to) {
                    case "cm":
                        num*=100;
                        System.out.printf("%.8f cm", num);
                        break;
                    case "mi":
                        num*=0.000621371192;
                        System.out.printf("%.8f mi", num);
                        break;
                    case "in":
                        num*=39.3700787;
                        System.out.printf("%.8f in", num);
                        break;
                    case "km":
                        num*=0.001;
                        System.out.printf("%.8f km", num);
                        break;
                    case "mm":
                        num*=1000;
                        System.out.printf("%.8f mm", num);
                        break;
                    case "yd":
                        num*=1.0936133;
                        System.out.printf("%.8f yd", num);
                        break;
                    case "m":
                        System.out.printf("%.8f m", num);
                }
                break;
            case "yd":
                num/=1.0936133;
                switch(to) {

                    case "cm":
                        num*=100;
                        System.out.printf("%.8f cm", num);
                        break;
                    case "mi":
                        num*=0.000621371192;
                        System.out.printf("%.8f mi", num);
                        break;
                    case "in":
                        num*=39.3700787;
                        System.out.printf("%.8f in", num);
                        break;
                    case "km":
                        num*=0.001;
                        System.out.printf("%.8f km", num);
                        break;
                    case "ft":
                        num*=3.2808399;
                        System.out.printf("%.8f ft", num);
                        break;
                    case "mm":
                        num*=1000;
                        System.out.printf("%.8f mm", num);
                        break;
                    case "m":
                        System.out.printf("%.8f m", num);
                }
                break;
        }
    }
}
