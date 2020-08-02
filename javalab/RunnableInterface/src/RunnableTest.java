

class X implements Runnable{

    @Override
    public void run() {
        for(int i=1;i<=10;i++){
            System.out.println("thread X:"+i);
        }
        System.out.println("end of thread X");
    }
}





public class RunnableTest {

    public static void main(String[] args){
        X runnable=new X();
        Thread X=new Thread(runnable);
         X.start();
        System.out.println("end of main thread");


    }
}
