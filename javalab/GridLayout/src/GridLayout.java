
import java.awt.*;
import java.awt.event.*;

public class GridLayout extends Frame{

    int n=4;
    public GridLayout(){

        setLayout(new java.awt.GridLayout(n,n));

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                int k=i*n+j;
                if(k>0)
                {
                    add(new Button(" "+k));
                }
            }
        }

    }
    public static void main(String[] args){
        GridLayout a=new GridLayout();
        a.setSize(300,300);
        a.setTitle("GridLayout");
        a.setVisible(true);

    }

}