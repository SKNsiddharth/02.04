import java.util.Scanner;
public class A10 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number to check");
        int a = scan.nextInt();

        if (a%2==0)
            System.out.println("The number is even");

        else
        System.out.println("The number is odd");
        
    }
    
}

