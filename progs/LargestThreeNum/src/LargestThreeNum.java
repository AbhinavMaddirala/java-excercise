
import  java.util.Scanner;


public class LargestThreeNum {

    public static void main(String args[]){

        int firstNum;
        int secondNum;
        int thirdNum;

        Scanner in = new Scanner(System.in);

        System.out.println("enter the first number");
        firstNum= in.nextInt();
        System.out.println("enter the second number");
        secondNum=in.nextInt();
        System.out.println("enter the third number");
        thirdNum=in.nextInt();

//        largest of three numbers
        if (firstNum==secondNum && secondNum==thirdNum){
            System.out.println("all numbers are equal");
        }else if( (firstNum>secondNum) && (firstNum>thirdNum)){

            System.out.println(firstNum +"is largest of other two");
        }else if ((secondNum > thirdNum) && (secondNum>firstNum)){
            System.out.println(secondNum+"is largest of other two");
        }else
            System.out.println(thirdNum+"is largest of other two");

//TODO: check if all numbers are equal
    }
}
