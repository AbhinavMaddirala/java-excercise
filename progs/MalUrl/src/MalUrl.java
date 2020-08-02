import java.net.MalformedURLException;
import java.net.URL;

public class MalUrl {

    public static void main(String[] args){

        try{
            URL url=new URL("ftp://google.com");
            System.out.println("URL protocol:"+url.getProtocol());

        }catch (MalformedURLException e){
            System.out.println("correct the protocol:"+e);


        }




    }
}
