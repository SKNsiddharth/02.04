import java.util.Scanner;
public class A9 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number to check divisibility by 6");
        int a = scan.nextInt();

        if (a%6==0)
            System.out.println("The number is divisible by 6");

        else
        System.out.println("The number is not divisible by 6");
        
    }
    
}
