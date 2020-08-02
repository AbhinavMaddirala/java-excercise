

import java.awt.*;
import javax.swing.*;
import java.lang.Object;

public class JTableDemo {

    String[] cotleds={"name","regno","course","percentage"};
    Object[][] data={{"abhinav","529","cse","72"},
            {"uttam","522","cse","72"},
            {"uttam","522","cse","72"},
            {"uttam","522","cse","72"},
            {"abhinav","529","cse","72"},
            {"abhinav","529","cse","72"},
            {"abhinav","529","cse","72"},
            {"abhinav","529","cse","72"},
            {"abhinav","529","cse","72"},
            {"abhinav","529","cse","72"},
            {"abhinav","529","cse","72"},
            {"abhinav","529","cse","72"},
            {"abhinav","529","cse","72"},
            {"abhinav","529","cse","72"},
            {"abhinav","529","cse","72"},
            {"abhinav","529","cse","72"},
            {"abhinav","529","cse","72"},
            {"abhinav","529","cse","72"},
            {"abhinav","529","cse","72"},
            {"abhinav","529","cse","72"}};

    public JTableDemo(){

        JFrame jf=new JFrame("JtableDemo");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(300,300);
        JTable table=new JTable(data,cotleds);
        JScrollPane jsp=new JScrollPane(table);
        jf.add(jsp);
        jf.setVisible(true);
    }
    public static void main(String[] args){
        new JTableDemo();
    }
}
