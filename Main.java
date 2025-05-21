// package learnjava;

public class Main {
    public static void main(String[] args) {
        System.out.println("Vivek Jangid");
        int a = 4;
        int b = a;
        System.out.println(a + "," + b);
        String name = "Chhammo Jangid";
    // length()
        System.out.println(name.length());
     // charAt()
        // for (int i = 0; i < name.length(); i++) {
        //     System.out.println(name.charAt(i));
        // }
        System.out.println(name.charAt(6));
     // replace()
        System.out.println(name.replace("a", "o"));
        System.out.println(name); // Strings are immutable
    // substring
        System.out.println(name.substring(0, 7));

    }
}
