import java.util.Scanner;

public class FranhietToCelsius {

    public static void main(String args[]){


// problem can  be solved by one variable also ..by getting input and replacing
        // formual value


        int fTemp;
        int cTemp;

        Scanner in = new Scanner(System.in);
        System.out.println("enter the Franheit temperature");
        fTemp = in.nextInt();

        cTemp=((fTemp-32)*5)/9;

        System.out.println("the temperature in celsius is "+ cTemp);

    }
}
