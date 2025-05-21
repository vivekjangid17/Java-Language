// import java.io.*;
// import java.util.*;

interface Printable {
    void Print();
}

interface Showable {
    void Show();
}

public class interfacedemo implements
        Printable, Showable {
    public void Show() {
        System.out.println("Students");
    }

    public void Print() {
        System.out.println("Welcome");
    }

    public static void main(String[] args) {
        interfacedemo obj = new interfacedemo();
        obj.Print();
        obj.Show();
    }
}
