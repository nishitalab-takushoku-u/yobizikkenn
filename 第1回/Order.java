import java.util.Scanner;

public class Order {
    public static void main(String[] args) {
        System.out.print("欲しい商品の名前: ");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        System.out.println("「" + s + "」を注文します。");
    }
}