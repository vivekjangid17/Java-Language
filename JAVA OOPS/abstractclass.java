abstract class Animal {
    abstract void walk();
}

class Hourse extends Animal{
    public void walk(){
        System.out.println("walks on 4 legs");
    }
}
class Chicken extends Animal{
    public void walk(){
        System.out.println("walks in 2 legs");
    }
}

public class abstractclass {
    public static void main(String[] args) {
        Hourse hourse = new Hourse();
        hourse.walk();
        // Animal animal = new Animal();
        // animal.walk();
    
    }
    
}
