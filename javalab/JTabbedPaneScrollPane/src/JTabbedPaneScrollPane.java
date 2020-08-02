import javax.swing.*;




     class fruits extends JPanel{

        public fruits(){

            JButton b1=new JButton("apple");
            JButton b2=new JButton("banana");
            JButton b3=new JButton("pineaplle");
            add(b1);
            add(b2);
            add(b3);

        }
    }

    class subjects extends JPanel{

        public subjects() {


            JCheckBox ch1 = new JCheckBox("computer networks");
            JCheckBox ch2 = new JCheckBox("wt");
            JCheckBox ch3 = new JCheckBox("dbms");
            add(ch1);
            add(ch2);
            add(ch3);
        }
    }
     class leders extends JPanel{


        public leders(){

            JComboBox<String> jcb=new JComboBox<String>();
            jcb.addItem("netaji");
            jcb.addItem("jagan");
            add(jcb);

        }
    }


    public class JTabbedPaneScrollPane extends JFrame{

         public JTabbedPaneScrollPane(){

             JTabbedPane jtp=new JTabbedPane();
             jtp.addTab("fruits",new fruits());
             jtp.addTab("subjects",new subjects());
             jtp.addTab("leders",new leders());
             JScrollPane jsp=new JScrollPane(jtp);
             add(jsp);




         }
         public static void main(String[] args){

             JTabbedPaneScrollPane jtsp=new JTabbedPaneScrollPane();
             jtsp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
             jtsp.setSize(300,300);
             jtsp.setVisible(true);
             jtsp.setTitle("JtabbedScrollPane");
         }

    }

