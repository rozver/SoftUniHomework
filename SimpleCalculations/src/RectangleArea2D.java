import java.util.Scanner;

/**
 * Created by User on 7/8/2017.
 */
public class RectangleArea2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a1, a2;

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double d = sc.nextDouble();

        if(a>c) {
             a1 = a-c;
        }else {
             a1 = c-a;
        }

        if(b>d) {
             a2 = b-d;
        }else {
             a2 = d - b;
        }

        double area = a1*a2;

        double perimeter = 2*(a1+a2);

        if(area-0.25==(area-1) + 0.75) {
            System.out.println( area);
        }else {
            System.out.println(area);
        }
        if(area-0.25==(area-1) + 0.75) {
                System.out.println(perimeter);
            }else {
            System.out.println(perimeter);
            }

    }
}
