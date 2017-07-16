import java.util.Scanner;

/**
 * Created by User on 7/16/2017.
 */
public class AreaOfFigures {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String figure = sc.nextLine();

        if(figure.equals("square")) {
            double a = Double.parseDouble(sc.nextLine());
            double area = a*a;
            System.out.printf("%.3f", area);
        }else if(figure.equals("circle")) {
            double a = Double.parseDouble(sc.nextLine());
            double area = a*a*Math.PI;
            System.out.printf("%.3f", area);
        }else if(figure.equals("triangle")) {
            double a = Double.parseDouble(sc.nextLine());
            double h = Double.parseDouble(sc.nextLine());

            double area = (a*h)/2;
            System.out.printf("%.3f", area);
        }else if(figure.equals("rectangle")) {
            double a = Double.parseDouble(sc.nextLine());
            double b = Double.parseDouble(sc.nextLine());

            double area = a*b;
            System.out.printf("%.3f", area);
        }
    }

}
