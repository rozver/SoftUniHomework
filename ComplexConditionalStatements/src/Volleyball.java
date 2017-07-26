import java.util.Scanner;

public class Volleyball {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String yeartype = scanner.nextLine();
        int p = Integer.parseInt(scanner.nextLine());
        int h = Integer.parseInt(scanner.nextLine());

        double daysofplay = (48-h)*3.0/4 + h + p*2.0/3;

        switch (yeartype){
            case "normal":
                System.out.printf("%s",Math.floor(daysofplay));
                break;
            case "leap":
                daysofplay *= 1.15;
                System.out.printf("%s",Math.floor(daysofplay));
                break;
        }
    }
}
