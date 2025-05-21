
// import java.io.*;
import java.util.*;
public class stdmarks {
    public static void main(String args[])
    {
        Student s[]= new Student[5];
        for(int i=0;i<5;i++){
            s[i]=new Student();
        }
        
    }
}
class Student{
    Scanner sc=new Scanner(System.in);
    int Regno,total=0,subjects;
    String name;
    int marks[];

    Student(){
        System.out.println("enter registration number:");
        Regno=sc.nextInt();
        System.out.println("enter student name: ");;
        name=sc.next();
        getDiskmarks();

    }
    public void getDiskmarks(){
        marks=new int[3];
        System.out.println("enter marks of physics:");
        marks[0]=sc.nextInt();
        System.out.println("enter marks of chemistry:");
        marks[1]=sc.nextInt();
        System.out.println("enter marks of maths:");
        marks[2]=sc.nextInt();
        for(int i=0;i<3;i++){
            total=total+marks[i];
        
        }
        System.out.println("total marks of student "+name+":"+total);

    }
}