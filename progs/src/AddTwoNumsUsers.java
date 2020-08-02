import java.util.Scanner;

public class AddTwoNumsUsers {

    public static void main(String args[]){
//        declare variables

        int myFirstNumber;
        int mySecondNumber;
        int result;

        Scanner in = new Scanner(System.in);
//         take inout from users
        System.out.println("enter number 1:");
        myFirstNumber = in.nextInt();


        System.out.println("enter number 2:");
        mySecondNumber = in.nextInt();

        System.out.println("your added value is:");

        result= myFirstNumber + mySecondNumber;

        System.out.println(result);

//        TODO: edit to make string inputs


    }
}
