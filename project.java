import java.util.Scanner;

public class project {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Guess any number: ");
        int r_no = (int)((Math.random())*100);
        // System.out.println(r_no);
        int nguess;
        try{
        do{
             nguess = sc.nextInt();
            if(nguess<r_no && nguess>0){
                System.out.println("Higher number please ");
            }
            if (nguess>r_no) {
                System.out.println("Lower number please ");
            }
            if (nguess==r_no) {
                System.out.println("The random number is: "+r_no);
             } 
            if (nguess<=0) {
                break;
            }
             
        }while (true);
        // while(nguess>=0);
        // while (nguess!=r_no);
     } catch (Exception e) {
        // TODO: handle exception
     }
    }
}
