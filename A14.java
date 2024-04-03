import java.util.Scanner;
public class A14 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number");
        int age1 = scan.nextInt();

        System.out.println("Enter the second number");
        int age2 = scan.nextInt();

        System.out.println("Enter the third number");
        int age3 = scan.nextInt();

        if (age1>=age2)
            {
                if(age1>=age3)
                System.out.println(age1 + " is the largest");
            
            
                else
                System.out.println(age3 + " is the largest");
            }

        else
        {
          if(age2>=age3)
             {
            
               System.out.println(age2 + " is the largest");
             }
             else
             System.out.println(age3 + " is the largest");
        }
        
    }
    
}

