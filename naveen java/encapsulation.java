class A
{
    int age = 19;

    String name;

    public A()
    {
        super();
        System.out.println("in A");
    }

    public A(int a)
    {
        super();
        System.out.println("in int A");
    }

}

class B extends A
{
    public B()
    {
        super();
        System.out.println("in B");
        System.out.println(super.age);
    }

    public B(int a)
    {
        this();
        System.out.println("in int B");
    }
}

public class encapsulation
{
    public static void main(String args[])
    {
        B obj2 = new B(5);
    }
}
