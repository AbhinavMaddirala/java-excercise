
import java.net.*;
import java.util.*;
import java.io.*;

public class URLHeader {

    public static void main(String[] args) throws Exception{
        URL u=new URL("https://www.google.com");
        URLConnection uc=u.openConnection();
        System.out.println("content type: "+uc.getContentType());
        System.out.println("content-encoding: "+uc.getContentEncoding());
        System.out.println("content_lenght"+uc.getContentLength());
        System.out.println("date "+new Date(uc.getDate()));

    }
}

