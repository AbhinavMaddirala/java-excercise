
import javax.swing.*;

public class JPasswordField {

    public static void main(String[] args){

        JFrame jf=new JFrame("JPasswordFieldDemo");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(300,300);
        JPasswordField value=new JPasswordField();
        JLabel l1=new JLabel("password");
        l1.setBounds(20,100,80,30);
        jf.add(value);
        jf.add(l1);
        jf.setVisible(true);
        jf.setLayout(null);
    }

}
