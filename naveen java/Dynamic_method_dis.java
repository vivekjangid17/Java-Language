// It is possible to create a reference of a super class and object of a child class

class A{
    public void show(){
        System.out.println("in A show");
    }
}
class B extends A {
    public void show(){
        System.out.println("in B show");
    }
}
class C extends A {
    public void show(){
        System.out.println("in C show");
    }
}

// if we create a another class class D
class D{
    public void show(){
        System.out.println("in D show");
    }
}

public class Dynamic_method_dis {
    public static void main(String args[]){
        A obj = new A();
        obj.show();


        obj = new B();
        obj.show();


        obj = new C();
        obj.show();

        // obj = new D();  
        // obj.show();

        // it is not possible becoz D is not extended from A

    }
}
