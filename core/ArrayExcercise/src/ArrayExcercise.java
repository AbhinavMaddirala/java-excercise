public class ArrayExcercise {

    public static void main(String args[]){

        // declare int array

        int[] excerciseArray={3,4,2,7,3,4,5,44,33,22,66,22};

        // print array elements

        for(int i=0;i<excerciseArray.length;i++)
            System.out.println(excerciseArray[i]);

        // find largest element
         int largest=excerciseArray[0];
         for(int i=1;i<excerciseArray.length;i++)
         {
             if(excerciseArray[i]>largest)
                 largest=excerciseArray[i];
         }
        System.out.println("largest number is"+largest);

        //sumup all elements
          int sum=0;
          for (int i=0;i<excerciseArray.length;i++)
          {
             // sum=sum+excerciseArray[i];
              sum+=excerciseArray[i];
          }
        System.out.println("sum of elements is "+sum);

    }


}
//TODO: perform the same with double
