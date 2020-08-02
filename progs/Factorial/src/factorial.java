import java.util.Scanner;

public class factorial {

    public static void main(String args[]) {

        int number;
        int temp=1;
        Scanner in = new Scanner(System.in);

        System.out.println("enter the number to find factorial");
        number=in.nextInt();

        if (number <=0){
            System.out.println("please enter a number greater than 0");

        }else{

            for (int i=number;i>=1;i--){
                temp=temp*i;
            }
// another way of writing the loop:
//            for (int i=1;i<=number;i++){
//                temp=temp * i;
//            }

        }
        System.out.println("factorial is "+temp);


    }
}


