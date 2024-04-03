import java.util.Scanner;

public class A16 {
    public static void main(String[] args) {
        
    
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the number");
    int num = scan.nextInt();

    if(num%15==0)
    System.out.println("A multiple");

    else
    System.out.println("Not a multiple");

    
    
    }   
}
