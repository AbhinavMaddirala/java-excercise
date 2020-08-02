import java.util.concurrent.Callable;

class A extends Thread{

    public void run()
    {
        System.out.println("thread A started");
        for(int i=1;i<=5;i++)
        {
            System.out.println("from thread A:i="+i);

        }
        System.out.println("exit from A");
    }

}

class B extends Thread{

    public void run(){

        System.out.println("thread B started");
        for(int j=1;j<=5;j++)
        {
            System.out.println("from thread B:j="+j);
        }
        System.out.println("exit from B");
    }

}


class C extends Thread{

    public void run(){

        System.out.println("thread C started");
        for(int k=1;k<=5;k++)
        {
            System.out.println("from thread c:k="+k);
        }
        System.out.println("exit from c");
    }
}


public class ThreadPriority {

    public static void main(String[] args){

        A ta =new A();
        B tb =new B();
        C tc =new C();

        tc.setPriority(Thread.MAX_PRIORITY);
        tb.setPriority(Thread.MIN_PRIORITY);
        System.out.println("start thread A");
        ta.start();
        System.out.println("start thread B");
        tb.start();
        System.out.println("start thread C");
        tc.start();
        System.out.println("end of main thread");


            }


    }

