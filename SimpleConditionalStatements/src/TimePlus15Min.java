import java.util.Scanner;

/**
 * Created by User on 7/16/2017.
 */
public class TimePlus15Min {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h = Integer.parseInt(sc.nextLine());
        int min = Integer.parseInt(sc.nextLine());

        min+=15;

        if(min>=60) {
            h++;
            min-=60;
        }
        if(h>=24) {
            h-=24;
        }

        if(min<10) {
            System.out.println(h+  ":0" + min);
        }else {
            System.out.println(h + ":" + min);
        }
    }
}
