
import java.net.*;
import java.util.*;
import java.io.*;

public class URLSplit {


    public static void main(String args[]){
        try {
            URL url = new URL("https://www.google.com");
            System.out.println("protocol: " + url.getProtocol());
            System.out.println("host name: " + url.getHost());
            System.out.println("portnumber: " + url.getPort());
            System.out.println("filename " + url.getFile());
        }
        catch(Exception e){
            System.out.println(e);
        }



    }
}
