public class static_var2 {
    static int count = 0;

    static_var2()
    {
        count++;
        System.out.println(count);
    }
    public static void main(String args[])
    {
        static_var2 v1 = new static_var2();
        static_var2 v2 = new static_var2();
        static_var2 v3 = new static_var2();
    }
}
