
import java.util.ArrayList;
import java.util.Scanner;

public class LastInList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            int j = list.size() - 1;
            if (input.equals("")) {
                System.out.println(list.get(j));
                break;
            }

            list.add(input);
        }

    }
}
