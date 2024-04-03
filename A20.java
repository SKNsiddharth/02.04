import java.util.Scanner;
public class A20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter side of square");
        double a = scan.nextDouble();
        

        double perimeter = 4*a;
        System.out.println("perimeter is: " + perimeter);
        
        
    }
}
