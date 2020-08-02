import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class MyLinkedList {

    public  static void main(String[] args){

//        Banker john=new Banker("john",2999.40);
//    Banker jane;
//    jane=john;
//    jane.setcBalance(40.4);
//
//        System.out.println("balance is"+john.getcBalance());


        ArrayList<Integer> myIntList=new ArrayList<>();

        myIntList.add(5);
        myIntList.add(7);
        myIntList.add(8);
        myIntList.add(9);

        for(int i=0;i<myIntList.size();i++)
        {
            System.out.println(i + "-----"+myIntList.get(i));
        }

        myIntList.add(1,6);
        System.out.println("------------------------------------------");
        for(int i=0;i<myIntList.size();i++)
        {
            System.out.println(i + "-----"+myIntList.get(i));
        }

//        linkedlist example

        LinkedList<String> programming=new LinkedList<>();
        programming.add("c");
        programming.add("java");
        programming.add("python");

        //iterators

        pllist(programming);

        programming.add(1,"swift");
        pllist(programming);









    }



    public static  void pllist(LinkedList<String> ll){
        Iterator<String>  i= ll.iterator();
        while(i.hasNext())
        {
            System.out.println("your language is :" + i.next());

        }



    }


}
