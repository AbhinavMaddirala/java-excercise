import java.util.Scanner;


import java.util.Scanner;


public class GradeGreetings {

    public static void main(String args[]){

        // TODO : take input from user and assign it to grade

        char grade;
        Scanner in =new Scanner(System.in);
        System.out.println("enter the grade of the student");
        grade=in.nextInt();
//         char grade ='B';
         switch (grade){
             case 'A':
                 System.out.println("amazing work there keep going");
                 break;
             case 'B':
             System.out.println("you can do better");
             break;
             case 'C':
                 System.out.println("little mpore hardwork");
                 break;

             case 'D':
                 System.out.println("get serious");
                 break;
             case 'E':
                 System.out.println("almost failed");
                 break;

             case 'F':
                 System.out.println("you need to focus");
                 break;
             default:
                 System.out.println("grade can only be A to F");
         }

         // TODO: WAP FOR A A STAR TO 5 STAR RATING SYSTEM

    }
}
