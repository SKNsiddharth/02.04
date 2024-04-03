import java.util.Scanner;
public class A5 {
    public static void main(String[] args) {
      
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a decimal number");
        double a = scan.nextDouble();

        int b = (int)a;
        System.out.println("The typecasted value is " + b);
    }
    
}
