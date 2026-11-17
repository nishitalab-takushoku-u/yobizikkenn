import java.util.Scanner;

public class Floor1 {
    public static void main(String[] args) {
            System.out.print("小数 x = ");
            Scanner scanner = new Scanner(System.in);
            double x = scanner.nextDouble();

            double y = ((int) (x*10)) / 10.0;        
            System.out.println("x の小数第二位以下を切り捨てると " + y);
    }
}

        
