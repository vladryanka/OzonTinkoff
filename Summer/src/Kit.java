import java.util.Scanner;

public class Kit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int n = in.nextInt();
        int a = n;
        int b = a;
        while (b >= 0)
        {
            for (int i = s;i>0;i--)
            {
                a = a-i;
                if (a<0) break;
                else b = a;
            }
            if (a<0) break;
        }
        System.out.println(b);
    }
}
