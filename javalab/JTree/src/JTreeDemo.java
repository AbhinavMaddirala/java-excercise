
import javax.swing.*;
import javax.swing.tree.*;


public class JTreeDemo {

    public JTreeDemo(){

        JFrame jf=new JFrame("JTreeDemo");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(300,300);
        DefaultMutableTreeNode top=new DefaultMutableTreeNode("options");
        DefaultMutableTreeNode a=new DefaultMutableTreeNode("A");
        top.add(a);
        DefaultMutableTreeNode a1=new DefaultMutableTreeNode("A1");
        a.add(a1);
        DefaultMutableTreeNode a2=new DefaultMutableTreeNode("A2");
        a.add(a2);
        DefaultMutableTreeNode b=new DefaultMutableTreeNode("B");
        top.add(b);
        DefaultMutableTreeNode b1=new DefaultMutableTreeNode("B1");
        b.add(b1);
        DefaultMutableTreeNode b2=new DefaultMutableTreeNode("B2");
        b.add(b2);


        JTree jt=new JTree(top);
        JScrollPane jsp=new JScrollPane(jt);
        jf.add(jsp);
        jf.setVisible(true);



    }
    public static void main(String[] args){

        new JTreeDemo();
    }

}
