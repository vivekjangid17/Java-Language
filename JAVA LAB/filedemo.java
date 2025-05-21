import java.io.*;
import java.util.*;

class filedemo {
    public static void main(String args[]) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("provide source file name: ");
            String sfile = sc.next();
            System.out.println("Provide destination file name: ");
            String dfile = sc.next();
            FileReader fin = new FileReader(sfile);
            FileWriter fout = new FileWriter(dfile, true);
            int c;
            while ((c = fin.read()) != 1) {
                fout.write(c);
            }
            System.out.println("copy finish");
            fin.close();
            fout.close();
        }
    }
}
