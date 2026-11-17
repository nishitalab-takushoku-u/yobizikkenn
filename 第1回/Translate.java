import java.util.Scanner;

public class Translate {
    public static void main(String[] args) {
        System.out.print("n = ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        String[] es = {"zero", "one", "two", "three", "four",
            "five", "six", "seven", "eight", "nine"};
        System.out.println(es[n]);
    }
}