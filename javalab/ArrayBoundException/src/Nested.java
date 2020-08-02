



public class Nested {

    public static void main(String[] args){


            int a=2,b=4,c=2,x=7,y=5,z;
            int p[10]={2,5,6,7,8};
            p[11]=33;
            try{
                z=x/(b*b)-(y*a*c);
                System.out.println("the value of z is "+z);
            }
            catch(ArithmeticException e){
                System.out.println("division by zero" + e);
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println("array erro " + e);
            }

    }
}
