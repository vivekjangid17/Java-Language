public class arrays
{
    public static void main(String[] args) 
    {
        int arr[][] = new int[3][4];   // arr.length will give the number of rows, which is 3
        // arr[i] will give the number of columns, which is 4 for all i (0 to 2)

        // Initialize the array with random values
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < arr[i].length; j++)
            {
                arr[i][j] = (int)(Math.random() * 100);
            }
        }

        // Print the array values using traditional for loop
        System.out.println("Printing array using traditional for loop:");
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < arr[i].length; j++)
            {
                System.out.print(arr[i][j] + "  "); // Use print to stay on the same line
            }
            System.out.println(); // Newline after each row
        }

        // // Print the array values using enhanced for loop
        // System.out.println("Printing array using enhanced for loop:");
        // for(int[] row : arr)
        // {
        //     for(int element : row)
        //     {
        //         System.out.print(element + "  "); // Use print to stay on the same line
        //     }
        //     System.out.println(); // Newline after each row
        // }
    }
}
