import java.util.Scanner;

public class Narabekae3 {
    public static void main(String[] args) {
        System.out.println("3つの整数を入力してください。");
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        System.out.print("小さい順に並べ替えると ");
        if (l <= m && m <= n) {
            System.out.print(l + ", " + m + ", " + n);
        }
        else if (l <= n && n <= m) {
            System.out.print(l + ", " + n + ", " + m);
        }
        else if (m <= l && l <= n) {
            System.out.print(m + ", " + l + ", " + n);
        }
        else if (m <= n && n <= l) {
            System.out.print(m + ", " + n + ", " + l);
        }
        else if (n <= l && l <= m) {
            System.out.print(n + ", " + l + ", " + m);
        }
        else if (n <= m && m <= l) {
            System.out.print(n + ", " + m + ", " + l);
        }
        System.out.println(" になります。");
    }
}