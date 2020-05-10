import java.awt.*;
public class star{
    public static void main(String[] args)
    {
        Frame a=new Frame();
        a.setSize(1280,780);
        a.show();
        a.setBackground(Color.BLACK);
        StarPanel spanel=new StarPanel();
        a.add(spanel);
    }
}

class StarPanel extends Panel{
    public void paint(Graphics star) {

        star.setColor(Color.WHITE);
        for(int amt=0;amt<300;amt++){

            star.drawString("sb yufan", (int)(Math.random()*1280),(int)(Math.random()*720));
        }

    }
}