class NpE{

    void display(){
        System.out.println("hello");

    }
}


public class NullPointerException {

    public static void main(String[] args){

        NpE n1=null;
        try{
            n1.display();
        }
        catch (java.lang.NullPointerException e){
            System.out.println(" "+e);
        }
        System.out.println("end of program");
    }

}
