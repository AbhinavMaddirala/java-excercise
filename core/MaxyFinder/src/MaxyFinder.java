public class MaxyFinder {


    public static <T extends Comparable<T>> T maxy(T x,T y,T z){

        T maxy =x;
        if(y.compareTo(maxy)>0){
            maxy=y;
        }
        if(z.compareTo(maxy)>0){
            maxy=z;
        }
        return maxy;
    }


    public static void main(String[] args){

        System.out.printf("max  is: %s",maxy("apple","microsoft","google"));

        Holder<String> stringValue=new Holder<>();
        stringValue.setMyVar(new String("\n class"));
        System.out.println(stringValue.getMyVar());

        Holder<Integer> integerValue=new Holder<>();
        integerValue.setMyVar(new Integer(25));
        System.out.println(integerValue.getMyVar());



    }
}
