import java.util.Scanner;

/**
 * Created by User on 7/26/2017.
 */
public class PointOnRectangleBorder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double x1 = Double.parseDouble(sc.nextLine());
        double y1 = Double.parseDouble(sc.nextLine());
        double x2 = Double.parseDouble(sc.nextLine());
        double y2 = Double.parseDouble(sc.nextLine());
        double x = Double.parseDouble(sc.nextLine());
        double y = Double.parseDouble(sc.nextLine());
        String str = "";
        if(x==x1 || x==x2) {
            if(y>=y1 && y<=y2) {
                str = "Border";
            }
        }else if(y==y1 || y==y2) {
            if (x >= x1 && x <= x2) {
                str = "Border";
            }
        }
        if(str=="Border") {
            System.out.println(str);
        }else {
            System.out.println("Inside / Outside");
        }
    }
}
