import java.awt.*;
import java.awt.event.*;
import java.applet.*;
 <applet code="keyEvents" width=300 height=100></applet>







public class SimpleKey extends Frame implements KeyListener{

    String msg=" ";
    String keyState=" ";
    public SimpleKey()
     {
        addKeyListener(this);
    }

    public void KeYPressed(KeyEvent ke){
        keyState="keyDown";
        repaint();
    }
    public void KeyReleased(KeyEvent ke)
    {
        keyState="keyup";
        repaint();
    }
    public void KeyTyped(KeyEvent ke){

        msg=ke.getKeyChar();
        repaint();
    }
    public void paint(Graphics g)
    {
        g.drawString(msg,20,100);
        g.drawString(keyState,20,50);

    }
    public static void main(String[] args)
    {
        SimpleKey a=new SimpleKey();
        a.setSize(300,300);
        a.setTitle("keyEventDemo");
        a.setVisible(true);
    }




}
