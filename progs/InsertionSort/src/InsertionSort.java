public class InsertionSort {


    public static int[] InsertionSort(int[] input){
        int temp;
        for(int i=1;i<input.length;i++){
            for(int j=i;j>0;j--){
                if(input[j]<input[j-1])
                {
                    temp=input[j];
                    input[j]=input[j-1];
                    input[j-1]=temp;
                }
            }
        }
        return input;
    }

    public static void main(String args[]){
        int[] myArray={34,12,10,67,55,23,88,43};
        int[] sortedArray=InsertionSort(myArray);
        for(int i=0;i<sortedArray.length;i++)
        {
            System.out.print(sortedArray[i]);
            System.out.print(",");
        }
    }
}
