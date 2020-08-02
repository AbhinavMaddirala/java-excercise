import java.util.ArrayList;

public class ArrayListAdv {


    public static void main(String[] args){

        ArrayList<String> myArrayList=new ArrayList<String>();
        ArrayList<Integer> myNewArrayList = new ArrayList<Integer>();

        //set value
        for(int i=1;i<20;i++)
        {
            myNewArrayList.add(0,Integer.valueOf(i)); //Autoboxing
        }
        // get value
        for(int i=1;i<20;i++)
        System.out.println(myNewArrayList.get(i).intValue());
    }
}
