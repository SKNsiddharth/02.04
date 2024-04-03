import java.util.Scanner;
public class A8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of years for experience");
        int year = scan.nextInt();

        System.out.println("Enter salary");
        int sal = scan.nextInt();

        if (year<5)
        System.out.println("You are not eligible for bonus");
        
        else
        {
            System.out.println("Your bonus is " + year + '%');
            sal = sal + (sal/100)*year;
            System.out.println("new salary after bonus is: " + sal); 
        }
            
        
    }
    
}
