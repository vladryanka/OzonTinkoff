import java.util.ArrayList;
import java.util.Scanner;

public class ASCII {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        for (int j = 0; j < t; j++) {
            String[] line = in.nextLine().split(" ");
            String BigLine = "";
            int k = Integer.parseInt(line[0]);
            int n = Integer.parseInt(line[1]);
            int m = Integer.parseInt(line[2]);
            ArrayList<String> mountains = new ArrayList<>(n);
            for (int i = 0; i < n; i++)// заполнение одной горы
            {
                mountains.add(i, in.nextLine());
            }

            for (int y = 0;y<k-1;y++) {
                for (int i = 0; i < n; i++) {
                    String mountainSec = in.nextLine();
                    if (mountainSec == "") mountainSec = in.nextLine();

                    String newLine = "";
                    for (int a = 0; a < m; a++) {
                        if (mountains.get(i).charAt(a) == '.' && (mountainSec.charAt(a) == '/' || mountainSec.charAt(a) == '\\') || (mountains.get(i).charAt(a) == '.' && mountainSec.charAt(a) == '.') || mountains.get(i).charAt(a) == '.' && mountainSec.charAt(a) == 'X') {
                            newLine += mountainSec.charAt(a);
                        } else if ((mountains.get(i).charAt(a) == '/' || (mountains.get(i).charAt(a) == '\\')) && mountainSec.charAt(a) == 'X') {
                            newLine += mountains.get(i).charAt(a);
                        } else
                            newLine += mountains.get(i).charAt(a);
                    }
                    mountains.set(i, newLine);
                }
            }
            for (int q = 0; q < n; q++)
                System.out.println(mountains.get(q));
            System.out.println();
        }
    }
}
