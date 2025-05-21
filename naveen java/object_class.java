// Every class in java extends Object class by default
// Every object in java calls toString() method by default

class Laptop{
    String model;
    int price;

    public String toString(){
        return model+" : "+price;
    }
    Laptop(){
        int age = 56;
        System.out.println(age);
        show();  // We can only call a method in constructor. We cann't create a method inside a constructor.
    }
    public void show(){
        System.out.println("Vivek");
    }
}

public class object_class {
    public static void main(String[] args) {
        Laptop obj1 = new Laptop();
        obj1.model = "Lenovo Yoga";
        obj1.price = 70000;
        System.out.println(obj1);

        Laptop obj2 = new Laptop();
        obj2.model = "Lenovo Yoga";
        obj2.price = 70000;
        System.out.println(obj2.getClass());
    }
}
