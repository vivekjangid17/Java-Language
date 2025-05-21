// package learnjava;

import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        System.out.println("We are using scanner class for taking input in java ");
        // int Maths,Physics;
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the marks of Maths: ");
        // Maths = sc.nextInt();
        // System.out.println("Enter the marks of Physics: ");
        // Physics = sc.nextInt();
        // System.out.println("The marks of Maths and Physics are: "+Maths+","+Physics);
        System.out.println("Enter your name: ");
        String name = sc.next();
        System.out.println(name);
        System.out.println("Write a sentence: ");
        String sentence = sc.nextLine();
        System.out.println(sentence);


    }
    
}
