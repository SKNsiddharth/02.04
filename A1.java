
import java.util.Scanner;
public class A1 {

    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);

        System.err.println("Enter age of 1st person");
        int age1 = scan.nextInt();
        System.out.println("Enter age of 2nd person");
        int age2 = scan.nextInt();
        System.out.println("Enter age of 3rd person");
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
