import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        in.nextLine();
        String p = in.nextLine();
        int end = 0;
        ArrayList<Character> array = new ArrayList<Character>();
        ArrayList<Integer> arrayInt = new ArrayList<Integer>();
        if (k<=n) {
            for (int i = 0; i < p.length(); i++) {
                int count = 1;
                for (int j = 0; j < array.size(); j++) {
                    if (array.get(j) == p.charAt(i))
                        count++;
                }
                if (count == 1) {
                    array.add(p.charAt(i));
                    arrayInt.add(count);
                }
                else {
                    for (int j = 0;j<array.size();j++)
                    {
                        if (array.get(j) == p.charAt(i))
                            arrayInt.set(j,count);
                    }
                }
            }
            Collections.sort(arrayInt);
            while (k>0)
            {
                if (arrayInt.get(0)<=k) {
                    k -= arrayInt.get(0);
                    arrayInt.remove(0);
                }
                else {
                    arrayInt.set(0, arrayInt.get(0) - k);
                    k = 0;
                }
            }

            end = arrayInt.size();

        }

        System.out.println(end);
    }
}
