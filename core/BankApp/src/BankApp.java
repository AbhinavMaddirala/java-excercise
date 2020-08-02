public class BankApp {

    String name;
    int age;
    String taxDetail;
    double amount;

    //constructor
    public BankApp(String name){
        this.name = name;
        System.out.println("constructor called");

    }

    //ask user for age
    public void accAge(int age){
        this.age=age;
    }

    public void accTax(String taxDetail){

        this.taxDetail=taxDetail;
    }

    public void depositAmount(double amount){

        this.amount=amount;
    }
    public void getUserInfo(){
        System.out.println("name of user is:"+this.name);
        System.out.println("name of balance:"+amount);

    }



}
