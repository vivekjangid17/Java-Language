import java.net.*;
import java.io.*;

class server {
    public static void main(String args[]) throws Exception {
        ServerSocket ss = new ServerSocket(3333);
        Socket s = ss.accept();
        DataInputStream din = new DataInputStream(s.getInputStream());
        DataOutputStream dout = new DataOutputStream(s.getOutputStream());
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = "", str2 = "";
        while (!str.equals("quit")) {
            str = din.readUTF();
            System.out.println("Client says: "+str);
            str2 = br.readLine();
            dout.writeUTF(str2);
            dout.flush();

        }
        din.close();
        s.close();
        ss.close();
    }
}