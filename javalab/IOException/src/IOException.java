import java.io.*;


public class IOException {

    public static void main(String[] args){

        try {
            int r = 0;
            FileInputStream f;
            f = new FileInputStream("no.txt");
            while ((r = f.read()) != -1) {
                System.out.println((char) r);
            }
            throw new IOException();
        }
        catch(IOException e){
            System.out.println("e");

        }
        finally {
            System.out.println("quit");
        }
    }

}
