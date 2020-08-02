public class BankUser {

    public static void main(String args[]){
//        BankApp john =new BankApp("john doe");
//
//        john.accAge(45);
//        john.depositAmount(100000);
//        john.getUserInfo();
//
//        BankApp jane =new BankApp("jane doe");
//        jane.accAge(25);
//        jane.depositAmount(30000);
//        jane.getUserInfo();


        //inheritance starts here

        SbiUser ram= new SbiUser("ram");

        ram.depositAmount(30000);

       //ram.accTax("myTaxDetail");
        ram.getUserInfo();
    }
}
