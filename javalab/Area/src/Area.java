
interface shape1{

    final float pi=3.14f;
    float area(int l,int b);
        }

        class rectangle implements shape1{

    public float area(int l, int b){

        return(l*b);
    }


        }

        class circle implements shape1{

    public float area(int l,int b){
        return(pi*l*b);

    }
        }


public class Area {

    public static void main(String[] args){
        rectangle r= new rectangle();
        System.out.println("area of rectangle is "+ r.area(3,4));
        circle c=new circle();
        System.out.println("area of circle is "+ c.area(5,5));

    }



}
