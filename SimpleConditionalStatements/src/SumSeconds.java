import java.util.Scanner;

/**
 * Created by User on 7/16/2017.
 */
public class SumSeconds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = Integer.parseInt(sc.nextLine());
        int num2 = Integer.parseInt(sc.nextLine());
        int num3 = Integer.parseInt(sc.nextLine());

        int sum = num1+num2+num3;

        if(sum>9 && sum<60) {
            System.out.println("0:" + sum);
        }else if(sum>59 && sum<120) {
            sum-=60;
            if(sum>9) {
                System.out.println("1:" + sum);
            }else {
                System.out.println("1:0" + sum);
            }

        }else if(sum>=120 && sum<180) {
            sum-=120;
            if(sum>9) {
                System.out.println("2:" + sum);
            }else {
                System.out.println("2:0" + sum);
            }
        }else if(sum<10) {
            System.out.println("0:0" + sum);
        }
    }
}
