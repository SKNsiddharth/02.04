import java.util.Scanner;
public class A19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter side 1");
        double a = scan.nextDouble();
        System.out.println("Enter side 2");
        double b = scan.nextDouble();

        double area = a*b;
        System.out.println("area is: " + area);
        
        
    }
}
