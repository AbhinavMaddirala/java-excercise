

class A extends Thread{

    public void run(){
        System.out.println("thread A started");
        for(int i=1;i<=5;i++){
            System.out.println("from thread A: "+i);

        }
        System.out.println("end of thread A");
    }

}
class B extends Thread{

    public void run(){
        System.out.println("thread B started");
        for(int j=1;j<=5;j++){
            System.out.println("from thread A: "+j);

        }
        System.out.println("end of thread B");
    }

}

class C extends Thread{

    public void run(){
        System.out.println("thread C started");
        for(int k=1;k<=5;k++){
            System.out.println("from thread C: "+k);

        }
        System.out.println("end of thread C");
    }

}






public class ThreadPriority {
    public static void main(String[] args){
        A a=new A();
        B b=new B();
        C c=new C();

        c.setPriority(Thread.MAX_PRIORITY);
        b.setPriority(Thread.MIN_PRIORITY);
        System.out.println("start thread a");
        a.start();
        System.out.println("start thread b");
        b.start();
        System.out.println("start thread c");
        c.start();
        System.out.println("end of main thread");

    }



}
