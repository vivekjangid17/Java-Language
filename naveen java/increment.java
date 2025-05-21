public class increment
{
        public static void main(String args[])
        {
            int num = 7;
            // post - increment
            // num++;
            // pre - increment
            // ++num;
            // int result = num++; //fetch the value and then increment gives 7
            int result = ++num; // increment the value and then fetch gives 8
            System.out.println(result);
            int x = 6;
            int y = 5;
            boolean results = x < y;
            System.out.println(results);
        }
        
}
