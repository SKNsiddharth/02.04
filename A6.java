import java.util.Scanner;
public class A6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter character");
        char c = scan.next().charAt(0);

        if (c>'a'&&c<'z')
        System.out.println("LowerCase");

        else if (c>'A'&&c<'Z') 
        System.out.println("UpperCase");

        else
        System.out.println("Not a valid character");
        

            
        
        
    }
    
}
