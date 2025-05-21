class Mobile
{
    String brand;
    int price;
    static String name;


    static
    {
        name = "SmartPhone";
        System.out.println("inside static block");  
    }
    // no object creation is required to load static block
    // first of all a class will be loaded and then static block and after that constructor 

    public Mobile()
    {
        System.out.println("inside constructor");   
    }

    public void show()
    {
        System.out.println(brand+ " : "+ price + " : "+ name);
    }
    public static void displays()
    {
        int x = 56;
        System.out.println(x);
        System.out.println("in static"); 
        System.out.println(name);
        // System.out.println(brand+ " : "+ price + " : "+ name);
    }

}

public class staticVar {
    public static void print()
    {
        System.out.println("This is the method print() inside the class staticVar....");
    }
    public static void main(String args[])
    {
        // Class.forName(Mobile);  // will load the class only 
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 1400;
        // obj1.name = "SmartPhone";
        // we can also use 
        Mobile.name = "smartphone";

        // Mobile obj2 = new Mobile();
        // obj2.brand = "Samsung";
        // obj2.price = 1500;
        // Mobile.name = "SmartPhone";

        obj1.show();
        // obj2.show();
        System.out.println("Hello.........");
        Mobile.displays();
        print();

    }
}
