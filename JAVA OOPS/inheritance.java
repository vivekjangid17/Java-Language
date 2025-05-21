// package bank;
import bank;
// import bank.Account;

public class inheritance {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        // t1.color = "red";
        t1.area(73,5);

        bank.Account account1 = new bank.Account();
        account1.name = "customer";

    }
}
class Shape {
    String color;
    public void area(){
        System.out.println("displayes area ");
    }

}
class Triangle extends Shape {
    public void area(int l, int h){
        System.out.println((double)1/2*l*h);
    }

}
