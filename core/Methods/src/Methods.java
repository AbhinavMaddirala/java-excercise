public class Methods {

   // public - visible to everyone
   // private - visible to class
   // protected - visible to the pacakage and all

//    modifer return-type method-name( parameter list){
//        //body
//
//    }


    public static void main(String[] args){
        System.out.println("hello world");
        sayHello();
        int numberOne=7;
        int numberTwo=5;
//       int result=minNUm(numberOne,numberTwo);
  //      System.out.println(result);

        System.out.println(minNum(numberOne,numberTwo));





    }
    public static void sayHello(){
        System.out.println("hello java");
        System.out.println("how are you");

    }
    public static int minNum(int num1,int num2){
        int min;
        if(num1<num2){
            min=num1;
        }else{
            min=num2;
        }
        return min;
    }

}
