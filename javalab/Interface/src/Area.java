interface shape{
    float pi=3.14f;
    float area(int l,int b);
}
class rectange implements shape{
    public float area(int l,int b){
        return(l*b);
    }
}
class circle implements shape{

    public float area(int l,int b){
        return(pi*l*b);
    }
}





public class Area {


    public static void main(String[] args){

        rectange r=new rectange();
        System.out.println(" area of rectangle:"+r.area(3,5));
        circle c=new circle();
        System.out.println("area of circle is"+c.area(3,3));
    }
}
