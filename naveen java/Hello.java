class Hello 
{

    public static void main(String args[]) 
    {
        float num = 4.5f;
        long lg = 45554l;
        double d = 3454.5;
        System.out.println(d);
        boolean b = true;
        int num1 = 0b110;
        int num2 = 10_00_000;
        System.out.println("Hello World!");
        System.out.println(num1);
        System.out.println(num2);
        
        // casting
        byte bt = 34;
        int i = 45;
        bt = (byte)i;
        System.out.println(bt);
        int a = 259;  // here the range of int is 256 and if we assign an integer value out of its range and then we typecast it to byte datatype it will print the modulo of the int and range of int(int_var % range of int)
        System.out.println(a);
        bt = (byte)a;
        System.out.println(bt);
        byte by = 10;
        byte byt = 30;
        int result = by*byt;
        System.out.println(result);
        
    }

}
class typeCast{
    void printType(byte bt){
        System.out.println(bt);
    }
}