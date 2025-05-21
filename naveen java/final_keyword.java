class Calc {

    // private void show()  
    // if we make show() method private or final then method overriding is not possible I think

    final void show(){
        System.out.println("in Calc show");
    }
    public void add(int a, int b){
        System.out.println(a+b);
    }
}
class AdvCalc extends Calc {
    
    // we cann't override the show() method as it is final
    // public void show(){
    //     System.out.println("in AdvCalc show");
    // }
}

public class final_keyword {
    public static void main(String[] args) {
        AdvCalc obj = new AdvCalc();
        obj.show();
        obj.add(4, 6);
    }

    
}
