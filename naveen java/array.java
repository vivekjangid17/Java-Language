import java.util.Scanner;

public class array 
{   
    public static void main(String[] args) 
    {
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);

        // Loop to fill the array with values from user input
        for(int j = 0; j < arr.length; j++)
        {
            System.out.println("Enter the values: ");
            arr[j] = sc.nextInt();
        }

        // Loop to print the values in the array
        for(int i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i]);
            System.out.println();
        } 

        sc.close();
   }    
}

