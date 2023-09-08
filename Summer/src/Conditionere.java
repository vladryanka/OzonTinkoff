import java.util.Objects;
import java.util.Scanner;

public class Conditionere {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        for (int j = 0;j<t;j++) {
            int n = Integer.parseInt(in.nextLine());
            int low = 15;
            int heigh = 30;
            int answ = 0;
            for (int i = 0; i < n; i++) {
                String[] line = in.nextLine().split(" ");

                if (Objects.equals(line[0], ">=")) {
                    if (heigh >= Integer.parseInt(line[1])) {
                        if (low<=Integer.parseInt(line[1]))
                        low = Integer.parseInt(line[1]);
                    } else low = Integer.parseInt(line[1]);
                } else if (low <= Integer.parseInt(line[1])) {
                    if (heigh>=Integer.parseInt(line[1]))
                    heigh = Integer.parseInt(line[1]);
                } else heigh = Integer.parseInt(line[1]);
                if (low>heigh)
                    answ = -1;
                else
                    answ = low;
                System.out.println(answ);
            }
            System.out.println("\n");
        }
    }
}
