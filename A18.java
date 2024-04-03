import java.util.Scanner;
public class A18 {
   public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int myInput = scan.nextInt();
    System.out.println("The given number is: " + myInput);
      // to check given number is positive or negative
      boolean isGreater = (myInput > 0) ? true : false;
      if(isGreater) {
         System.out.println(myInput + " is a positive number");
      } else {
         System.out.println(myInput + " is a negative number");
   } 
}
}
