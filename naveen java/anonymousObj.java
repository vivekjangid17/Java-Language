class A
{
    public A()
    {
        System.out.println("object is created");
    }
    public void show()
    {
        System.out.println("in A show");
    }
}

public class anonymousObj 
{
    public static void main(String[] args) 
    {

        // A obj = new A();
        // A obj;
        // obj = new A();

        new A();    // anonymous object - just like as anonymous function(lambda) in python also known as bina name ka function 
        new A().show();
    }    
}


// Camel casing
// class and interface - Calc, Runnable
// variable and method - marks, show()
// constants - PIE, BRAND
// showMyMarks()
