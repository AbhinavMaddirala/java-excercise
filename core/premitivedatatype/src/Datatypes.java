public class Datatypes {

    public static void main(String[] args){
        System.out.println("New Module");

//        byte- -128 : 127
//        short - -32768 : 32767
//        int - -2,147,483,648
//        long - 9,223,372,036,854,775,808
//
//        float - 231.2f
//        double - 231.23
//        boolean - true/false
//        char -'A'
//          string

//        byte myByte = -114;
//        System.out.println(myByte);

           int mInt = 22/7;
           float mFloat =22/7f;
           double mDouble= 22/7d;
        System.out.println("Int value is : "+ mInt);
        System.out.println("double value is :"+ mDouble);
        System.out.println("float value is :"+ mFloat);

        boolean isActive = false;

        System.out.println(isActive);

        char mChar='a';
        String myValue = Integer.toHexString(mChar);
        System.out.println(myValue);

        char mUnicode='\u0187';
        System.out.println(mUnicode);

        String mString = " i am a string";
        System.out.println("answer is :"+mString);

        String fakeValue = "22.987";
        String fakeValue2= "33.8";
        System.out.println(mString+ " " +fakeValue2);
        System.out.println(mString.toUpperCase());
        System.out.println(mString.trim());







    }
}
