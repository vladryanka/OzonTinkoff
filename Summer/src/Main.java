import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuffer word = new StringBuffer(in.nextLine());
        int countStickers = Integer.parseInt(in.nextLine());
        for (int i = 0;i<countStickers;i++){
            String line = in.nextLine();
            String[] words = line.split(" ");
            int first = Integer.parseInt(words[0]);
            int sec = Integer.parseInt(words[1]);
            String newLine = words[2];
            word.replace(first-1,sec,newLine);
        }
        System.out.println(word);
    }
}
