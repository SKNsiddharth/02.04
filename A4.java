import java.util.Scanner;
public class A4 {
    public static void main(String[] args) {
       
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of days the student was present");
        int present = scan.nextInt();
        System.out.println("Enter the minimum criterion to appear for exams");
        int criterion = scan.nextInt();

        if(present>=criterion)
        System.out.println("Allowed for exams");

        else
        System.out.println("Not allowed for exams");

        
    }
    
}
