import java.util.Scanner;
public class A11 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = scan.nextInt();

        System.out.println("Enter the second number");
        int b = scan.nextInt();

        if (a>b)
            System.out.println("first number is greater");

        else if(b>a)
        System.out.println("second number is greater");

        else
        System.out.println("Both are equal");
        
    }
    
}

