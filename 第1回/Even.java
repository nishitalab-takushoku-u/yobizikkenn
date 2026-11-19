import java.util.Scanner;

public class Even {
    public static void main(String[] args) {
        System.out.print("n= ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n % 2 == 0) {
            System.out.println("n は偶数です。");
        }
        else {
            System.out.println("n は奇数です。");
        }
    }
}
