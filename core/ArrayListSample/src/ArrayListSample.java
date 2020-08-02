import java.util.ArrayList;

public class ArrayListSample {

    public static void main(String[] args){

//        String[] stringArray=new String[10];
//        stringArray[0]="delhi";
//        System.out.println(stringArray[0]);

        ArrayList<String> heros=new ArrayList<String>();
        heros.add("hulk");
        heros.add("batman");
        heros.add("iron man");
        heros.add(0,"captain america");


        System.out.println(heros.get(0));
        System.out.println(heros.get(1));
        System.out.println(heros.get(2));
        System.out.println(heros.get(3));




    }
}
