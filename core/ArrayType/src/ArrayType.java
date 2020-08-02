public class ArrayType {

    public static void main(String args[]){

        int score=40;
        int[] scoreArray=new int[10];

        int[] anotherScore={1,2,3,4,5,6};

      for(int i=0; i<scoreArray.length;i++)
          scoreArray[i]=i*10;
      for (int i=0; i<scoreArray.length;i++)
          System.out.println(scoreArray[i]);
    }
}
