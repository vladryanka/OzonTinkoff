import java.util.ArrayList;
import java.util.Scanner;

public class Detector {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Integer> a = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            a.add(in.nextInt());
        }

        int m = in.nextInt();

        for (int i = 0; i < m; i++) {
            String Error = "Yes";
            int w = in.nextInt() - 1;
            int o = in.nextInt() - 1;

            boolean descending = false;

            for (int j = w; j < o; j++) {

                int b = j + 1;
                if (a.get(j) <= a.get(b) && descending == false) {
                    descending = true;
                } else {
                    if (descending == true && (a.get(j) >= a.get(b))) {
                        Error = "Yes";
                        descending = false;


                    } else {
                        if (a.get(j) >= a.get(b)) {
                            Error = "Yes";
                            descending = false;
                        }
                        else {
                            Error = "No";
                            descending = true;
                        }
                    }
                }
            }
            System.out.println(Error);
        }

    }
}
