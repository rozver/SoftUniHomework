import java.util.Scanner;

/**
 * Created by User on 7/30/2017.
 */
public class VowelsSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        String s = sc.nextLine();

        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i)=='a') {
                sum++;
            }else if(s.charAt(i)=='e') {
                sum+=2;
            }else if(s.charAt(i)=='i') {
                sum+=3;
            }else if(s.charAt(i)=='o') {
                sum+=4;
            }else if(s.charAt(i)=='u') {
                sum+=5;
            }
        }

        System.out.println(sum);

    }
}
