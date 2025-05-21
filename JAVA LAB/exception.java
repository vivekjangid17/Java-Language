// package learnjava;

import java.util.Scanner;

public class exception 
{
    // public static int sum(int a, int b){
    //     return  a+b;


    // }
    public static void main(String args[])
    {
        // int c=sum(3, 8);
        // System.out.println(c);
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        for (int i = 0; i < 3; i++) {

            System.out.println("Enter the marks of student " + (i + 1));
            arr[i] = sc.nextInt();
        }
        try
        {

            System.out.println(arr[4]);
        } catch (Exception e) {
            // TODO: handle exception
        }
        System.out.println("The student name is Shyam");

    }
}
