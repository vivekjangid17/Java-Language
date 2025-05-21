class Calc 
{
    int num = 4;
    public int add(int n1, int n2) 
    {   
        int r = n1 + n2;
        return r;
    }
}

public class classes 
{
    public static void main(String args[]) 
    {
        int n4 = 6;
        Calc cal = new Calc();  // here cal is not an object, it's a reference variable
        int result = cal.add(4, 6);
        System.out.println("The result is: " + result);
        System.out.println(n4);
    }
}
