

//logic for leap year:
//there are 2 tests:
//                 1.divide a number by 400,no remainder - leap
//        2.  2.1) divide it by 4,no remainder
//        2.2) divide it by 100,should be a remainder

//(year%400==0) || (year%4==0 && year%100!=0)






public class LeapYear {

    public static void main(String args[]){

        int year = 2017;

        if ((year%400==0) || (year%4==0 && year%100!=0)){

            System.out.println("the year"+year+" is leap year");
        } else{
            System.out.println("the year"+year+"is not a leap year");
        }
    }
}
