// package Practice;

import java.util.Scanner;

public class file2 {
    public static void main(String args[]){
        int nguess;
        System.out.println("Random number guessing game");
        int rand_num = (int)(Math.random()*100);
        System.out.println("Random number is: "+rand_num);
        Scanner sc = new Scanner(System.in);
        
        do{
            System.out.println("Guess a number: ");
            nguess = sc.nextInt();
            if (rand_num > nguess) {
                System.out.println("Higher number please: ");
            }
            else if (rand_num < nguess) {
                System.out.println("Lower number please: ");
            }
            else {
                System.out.println("You have guessed the number: "+nguess);
                break;
            }


        }while(true);
        // System.out.println("You have guessed the number: "+nguess);
    
    }
    
}
