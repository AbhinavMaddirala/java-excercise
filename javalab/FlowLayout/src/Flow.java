import java.awt.*;

public class Flow{

//     A flow layout arranges components in a left-to-right flow, much like lines of text in a paragraph.
//    Flow layouts are typically used to arrange buttons in a panelA flow layout arranges components in a left-to-right flow, much like
//    lines of text in a paragraph. Flow layouts are typically used to arrange buttons in a panel



    public Flow(){

        Frame f=new Frame("Flow Layout");
        Button b1=new Button("ok");
        Button b2 =new Button("next");
        Button b3 =new Button("cancel");


        f.add(b1);
        f.add(b2);
        f.add(b3);

        f.setLayout(new FlowLayout(FlowLayout.CENTER));
        f.setSize(300,300);
        f.setVisible(true);
    }

    public static void main(String args[]){

        Flow X=new Flow();

    }}

