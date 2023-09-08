import java.util.ArrayList;
import java.util.Scanner;

public class Danger {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        ArrayList<Integer> a = new ArrayList<Integer>();
        for (int i = 0;i<n;i++)
        {
            a.add(in.nextInt());
        }
        for (int i = 0;i<c;i++)
        {
            int min = a.get(0);
            int k = 0;
            for (int j = 0; j < n;j++)
            {
                if (Math.abs((a.get(j)))<min) {
                    min = Math.abs(a.get(j));
                    k = j;
                }
            }
            int countOtris = 0;
            for (int j = 0;j<n;j++)
            {
                if (a.get(j)<0)
                    countOtris++;
            }
            if (countOtris%2==0)
            a.set(k,a.get(k)-d);
            else a.set(k,a.get(k)+d);
        }
        for (int i = 0; i< a.size();i++)
            System.out.print(a.get(i)+" ");
    }
}
