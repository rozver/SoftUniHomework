import java.util.Scanner;

/**
 * Created by User on 7/16/2017.
 */
public class BonusScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double bonus = 0;

        double num = Integer.parseInt(sc.nextLine());

        if(num<=100) {
            bonus+=5;
        }else if(num>100 && num<=1000) {
            bonus+=num/5;
        }else if(num>1000) {
            bonus+=num/10;
        }

        if(num%2==0) {
            bonus+=1;
        }else if(num%10==5) {
            bonus+=2;
        }

        System.out.println(bonus);
        System.out.println(bonus+num);
    }
}
