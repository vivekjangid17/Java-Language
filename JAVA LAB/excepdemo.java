// import java.io.*;
// import java.util.*;  
public class excepdemo {
   public static void main(String args[]) {
      try {
         int arr[] = new int[7];
         arr[8] = 30 / 0;
         System.out.println("Last statement of try block");
      } catch (ArithmeticException ex) {
         System.out.println("You should not divide a number by zero");
      } catch (ArrayIndexOutOfBoundsException e) {
         System.out.println("Array index is out of bounds");
      } catch (Exception ex) {
         System.out.println("Some other error");
      }
      System.out.println("out of the try-catch block");
   }
}
