
class x implements Runnable{
    public void run(){

        for(int i=1;i<=10;i++){
            System.out.println("Thread x: "+i);
        }
        System.out.println("end of thread X");
    }
}




public class RunnableTest {
    public static void main(String[] args){
        x runnable=new x();
        Thread threadx=new Thread(runnable);
        threadx.start();
        System.out.println("end of main thread");

    }
}
