class MyThread implements Runnable
{
    Thread thrd;
    boolean suspended;
    boolean stopped;

    MyThread(String name)
    {
        thrd = new Thread(this,name);
        suspended = false;
        stopped = false;
    }
    public static MyThread createAndStart(String name)
    {
        MyThread myThrd = new MyThread(name);
        myThrd.thrd.start();
        return myThrd;
    }
    public void run()
    {
        System.out.println(thrd.getName()+"Starting.");
        try
        {
            for(int i = 1; i<100; i++)
            {
                System.out.println(i+" ");
                if((i%10)==0)
                {
                    System.out.println();
                    Thread.sleep(250);
                }
                synchronized(this)
                {
                    while(suspended)
                    {
                        wait();
                    }
                    if(stopped)
                    {
                        break;
                    }
                } 
            }
        }
        catch(InterruptedException exc)
        {
            System.out.println(thrd.getName()+"interrupted.");
        }
        System.out.println(thrd.getName()+"exiting.");
    }
    // stop the thread
    synchronized void mystop()
    {
        stopped = true;
        suspended = false;
        notify();
    }
    // suspended the thread
    synchronized void mysuspend()
    {
        suspended = true;
    }
    //resume the thread
    synchronized void myresume()
    {
        suspended = false;
        notify();
    }
}

public class SuspendedDemo
{
    public static void main(String[] args) 
    {
        MyThread mt1 = MyThread.createAndStart("My Thread");
        try
        {
            Thread.sleep(1000);
            mt1.mysuspend();
            System.out.println("Suspending thread.");
            Thread.sleep(1000);

            mt1.myresume();
            System.out.println("Resuming thread.");
            Thread.sleep(1000);

            mt1.mysuspend();
            System.out.println("Suspending thread.");
            Thread.sleep(1000);

            mt1.myresume();
            System.out.println("Resuming thread.");
            Thread.sleep(1000);

            mt1.mysuspend();
            System.out.println("Suspending thread.");
            mt1.mystop();
        }
        catch(InterruptedException exce)
        {
            System.out.println("Main thread Interrupted.");
        }
        try
        {
            mt1.thrd.join();
        }
        catch(InterruptedException exc)
        {
            System.out.println("Main thread Interrupted");
        }
        System.out.println("Main thread exiting.");
    }
}