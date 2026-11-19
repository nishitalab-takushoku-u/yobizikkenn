import java.util.Scanner;

public class MEX10 { 
    public static void main (String [ ]args ) { 
        System.out.print("f= ");
        Scanner scanner = new Scanner(System.in);
        int f = scanner.nextInt();

        if (f >0 ) { 
            System .out.println("f は正の数です。" );
        } 
        else if (f ==0 ) { 
            System .out.println("f は 0 です。" );
        } 
        else  { 
            System .out.println("f は負の数です。" );
        } 
    } 
 }