
import java.awt.*;




public class BorderLayoutDemo extends Frame {


    public BorderLayoutDemo(){
        add(new Button("this is across the top"),BorderLayout.NORTH);
        add(new Button("the footer south"),BorderLayout.SOUTH);

        add(new Button("Right"),BorderLayout.EAST);
        add(new Button("left"),BorderLayout.WEST);
    }

    public static void main(String[] args){
        BorderLayoutDemo appwin=new BorderLayoutDemo();
        appwin.setSize(400,400);
        appwin.setVisible(true);
        appwin.setTitle("BorderLayoutDemo");
        appwin.setLayout(new BorderLayout());

    }

}

