import java.util.Scanner;

public class CompareTwoNum {

    public static void main(String args[]){

        // declare two double variables

        double numberOne;
        double numberTwo;

        Scanner in = new Scanner(System.in);
        // taking input from users

        System.out.println("enter first number");
        numberOne=in.nextDouble();

        System.out.println("enter the second number");
        numberTwo= in.nextDouble();

        if (numberOne > numberTwo){
            System.out.println("number1 greater than number2");
        }else if (numberOne < numberTwo){
            System.out.println("number1 is less than number2");
        }else {
            System.out.println("number1 equals to number2");
        }


    }
}
