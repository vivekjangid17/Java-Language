// import java.io.*;
// import java.util.*;
// import java.util.concurrent.ThreadPoolExecutor;

// public class threaddemo {
//     // string counter
//     int counter = 1;
//     static int n;

//     // function to print add numbres
//     public void printEvenNumver()
//     {
//         Synchronized(this)
//         {
//             while(counter<n)
//             {
//                 //if count is enven then print
//                 while(counter %2 == 0)
//                 {
//                 try
//                 {
//                     wait();
//                 }
//                 catch(InterruptedException e)
//                 {
//                 e.printStackTrace();
//             }
//         }
//         System.out.println(counter+" ");
//         counter++;
//         notify();
//             }
//         }
//     }
//     public void printOddNumber()
//     {
//         Synchronized(this)
//         {
//             while(counter<n)
//             {
//                 while(counter % 2 == 0)
//                 {
//                     try
//                     {
//                         wait();
//                     }
//                     catch(InterruptedException e)
//                     {
//                         e.printStackTrace();
//                     }
//                 }
//                 System.out.println(counter+" ");
//                 counter++;
//                 notify();
//             }
//         }
//     }
//     //Driver code
//     public static void main(String[] args) 
//     {
//       n=20;  
//       threaddemo mt = new threaddemo();
//       Thread t1 = new Thread(new Runnable()
//        {
//         public void run()
//         {
//             mt.printEvenNumver();
//         }
//       });
//       Thread t2 = new Thread (new Runnable()
//       {
//         public void run()
//         {
//             mt.printOddNumber();
//         }
//       });
//       t1.start();
//       t2.start();

//     }
// }

// import java.io.*;
// import java.util.*;
// import java.util.concurrent.ThreadPoolExecutor;

public class threaddemo {
    // string counter
    int counter = 1;
    static volatile int n;

    // function to print add numbers
    public void printEvenNumber() {
        synchronized(this) {
            while (counter <= n) {
                // if count is odd then print
                while (counter % 2 == 1) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(counter + " ");
                counter++;
                notify();
            }
        }
    }

    public void printOddNumber() {
        synchronized(this) {
            while (counter <= n) {
                // if count is even then print
                while (counter % 2 == 0) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(counter + " ");
                counter++;
                notify();
            }
        }
    }

    // Driver code
    public static void main(String[] args) {
        n = 20;
        threaddemo mt = new threaddemo();
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                mt.printEvenNumber();
            }
        });
        Thread t2 = new Thread(new Runnable() {
            public void run() {
                mt.printOddNumber();
            }
        });
        t1.start();
        t2.start();

    }
}
