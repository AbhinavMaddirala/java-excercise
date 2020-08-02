import  java.awt.*;
import java.awt.event.*;
public class CardLayoutDemo extends Frame {
    Checkbox windows10, windows7, windows8, android, solaris, mac;
    Panel osCards;
    CardLayout cardlo;
    Button Win, Other;

    public CardLayoutDemo() {
        setLayout(new FlowLayout());
        Win = new Button("Windows");
        Other = new Button("Others");
        add(Win);
        add(Other);
        cardlo = new CardLayout();
        osCards = new Panel();
        osCards.setLayout(cardlo);
        windows7 = new Checkbox("Windows 7", true);
        windows8 = new Checkbox("Windows 8");
        windows10 = new Checkbox("Windows 10");
        android = new Checkbox("Android");
        solaris = new Checkbox("Solaris");
        mac = new Checkbox("mac");
        Panel winPan = new Panel();
        winPan.add(windows10);
        winPan.add(windows8);
        winPan.add(windows7);
        Panel otherPan = new Panel();
        otherPan.add(android);
        otherPan.add(solaris);
        otherPan.add(mac);
        osCards.add(winPan, "Windows");
        osCards.add(otherPan, "Other");
        add(osCards);
        Win.addActionListener((ae -> cardlo.show(osCards, "Windows")));
        Other.addActionListener((ae -> cardlo.show(osCards, "Other")));
        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent me) {
                cardlo.next(osCards);
            }
        });
    }

    public static void main(String args[]) {
        CardLayoutDemo b = new CardLayoutDemo();
        b.setSize(new Dimension(300, 300));
        b.setTitle("CardLayoutDemo");
        b.setVisible(true);
    }
}

