
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = Integer.valueOf(scanner.nextLine());
        int n2 = Integer.valueOf(scanner.nextLine());
        double sqRoot = Math.sqrt((n1+n2));
        System.out.println(sqRoot);

    }
}
