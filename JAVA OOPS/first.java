public class first {
    public static void main(String[] args) {
        Student s1 = new Student("Ravindra", 19);
        s1.printInfo();
    }

}

class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void printInfo() {
        System.out.println(name);
        System.out.println(age);
    }
}

// public class first {
// public static void main(String args[]) {
// // Pen pen1 = new Pen();
// // pen1.color = "blue";
// // pen1.type = "ballpen";
// // pen1.write();

// // Pen pen2 = new Pen();
// // pen2.color = "red";
// // pen2.type = "gel";

// // pen1.printColor();
// // pen2.printColor();

// Student s1 = new Student("Ram",18);
// // s1.name = "Vivek";
// // s1.age = 19;
// // String s=s1.getName();
// // int a=s1.getAge();
// // System.out.println(s);
// // System.out.println(a);

// }
// }

// class Pen {
// String color;
// String type;

// public void write() {
// System.out.println("write something");

// }

// public void printColor() {
// System.out.println(color);
// }
// }

// class Student {
// String name;
// int age;

//
// Student(String name,int age)
// {
// // System.out.println("constructor called");
// this.name = name;
// // this.age = age;

// }

// public void printInfo() {
// System.out.println(this.name);
// System.out.println(this.age);
// }

// // public String getName() {
// // return name;
// // }

// // public int getAge() {
// // return age;
// // }

// }