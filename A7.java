import java.util.Scanner;
public class A7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter side 1");
        int a = scan.nextInt();
        System.out.println("Enter side 2");
        int b = scan.nextInt();

        if (a==b) 
          System.out.println("This is the side of square");  
        else
        System.out.println("This is the size of Rectangle");
        
        
    }
}
