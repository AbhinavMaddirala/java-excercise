
class Banker{
    private String name;

    public Banker(String name) {
        this.name = name;
    }

    public String greet(){
        return "default greetings";
    }

}

class SBIBank extends Banker{

    public SBIBank(String name) {
        super("SBIBank");
    }

    @Override
    public String greet() {
        return "welcome to SBI Bank";
    }
}

class BoABank extends Banker{
    public BoABank(String name) {
        super("BoA Bank");
    }

    @Override
    public String greet() {
        return "welcome to BoA Bank";
    }
}
class MyBank extends Banker{
    public MyBank(String name) {
        super("MyBank");
    }

    @Override
    public String greet() {
        return"welcome to MyBank";
    }
}









public class Main {
    public static void main(String[] args[]){

        for(int i =1;i<5;i++){
            Banker banker = GenerateObjects();
            System.out.println("Bank greet is"+banker.greet());
        }

    }
    public static Banker GenerateObjects(){
        int random=(int)(Math.random()*3)+1;
        System.out.println(random);
        switch (random){
            case 1:
                return new SBIBank();
                //break;
            case 2:
                return new BoABank();
                //break;
            case 3:
                return new MyBank();
                //break;
            default:
                return null;
                //break;

        }
    }
}











