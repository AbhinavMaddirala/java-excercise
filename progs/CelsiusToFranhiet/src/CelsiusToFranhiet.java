import java.util.Scanner;

public class CelsiusToFranhiet {

    public static void main(String args[]){
        int temp;//one varaible usage

        Scanner in =new Scanner(System.in);

        System.out.println("enter the celsuis temperature");
        temp=in.nextInt();

        temp= ((temp*9)/5)+ 32;
        System.out.println("the temperature in franheit is "+temp);

    }
}
