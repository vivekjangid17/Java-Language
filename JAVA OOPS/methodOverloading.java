// MethodOverloading is also known as compile time polymorphism.

public class methodOverloading {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "bholi";
        s1.age = 45;
        s1.printInfo(s1.name);
        s1.printInfo(s1.age);
        s1.printInfo(s1.name,s1.age);
    }
}
class Student {
    String name;
    int age;
    
    public void printInfo(String name){
        System.out.println(name);
    }
    public void printInfo(int age){
        System.out.println(age);
    }
    public void printInfo(String name,int age){
        System.out.println(name+", "+age);
    }
}
