import java.util.Scanner;

/**
 * Created by User on 7/8/2017.
 */
public class TriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();

        double area = (a*b)/2;

        System.out.println(area);
    }
}
