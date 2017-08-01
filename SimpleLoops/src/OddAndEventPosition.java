import java.util.Scanner;

/**
 * Created by User on 7/30/2017.
 */
public class OddAndEventPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        double j;
        double oddMinn = 1000000000.0;
        double oddMaxx = -1000000000.0;
        double evenMinn = 1000000000.0;
        double evenMaxx = -1000000000.0;
        double oddSum = 0;
        double evenSum = 0;
        int n = Integer.parseInt(sc.nextLine());



        for(int i=1; i<=n; i++) {
            j = Double.parseDouble(sc.nextLine());
            if(i%2==0) {
                if(j>evenMaxx) {
                    evenMaxx = j;
                }else if(j<evenMinn) {
                    evenMinn = j;
                }
                evenSum+=j;
            }else {
                if(j>oddMaxx) {
                    oddMaxx = j;
                }else if(j<oddMinn) {
                    oddMinn = j;
                }
                oddSum+=j;
            }
        }

        System.out.print("OddSum="+oddSum);


        if(oddMinn==1000000000.0) {
            System.out.print(",OddMin=No");
        }else {
            double oddMin = oddMinn;
            System.out.print(",OddMin=" + oddMin);
        }

        if(oddMaxx==-1000000000.0) {
            System.out.print(",OddMax=No");

        }else {
            double oddMax = oddMaxx;
            System.out.print(",OddMax=" + oddMax);
        }

        System.out.print(",EvenSum="+evenSum);

        if(evenMinn==1000000000.0) {
            System.out.print(",EvenMin=No");
        }else {
            double evenMin = evenMinn;
            System.out.print(",EvenMin="+evenMin);
        }
        if(evenMaxx==-1000000000.0) {
            System.out.print(",EvenMax=No");
        }else {
            double evenMax = evenMaxx;
            System.out.print(",EvenMax="+evenMax);
        }


    }
}
