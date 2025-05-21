// import java.io.*;
// import java.util.*;
public class greatest_among_3_numbers{
    public static void main(String args[])
    {
        int a = 5566, b = 1656, c = 9;
        if(a>b && a>c){
        System.out.println("The largest is "+a);
        }
        else if(b>a && b>c){
        System.out.println("The largest is "+b);
        }
        else{
            System.out.println("The largest is "+c);
        }
    }
}

