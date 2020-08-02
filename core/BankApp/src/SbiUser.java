public class SbiUser extends BankApp {

    public SbiUser(String name){
        super(name);
        System.out.println("i am a constructor from new class");
    }

    @Override
    public void getUserInfo() {
        super.getUserInfo();
        System.out.println("name of tax info is:"+taxDetail);
    }
}

//public class NewBank extends BankApp{
//
//    public NewBank(String name){
//        super(name);
//    }
}
