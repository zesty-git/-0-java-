import java.awt.*;

public class main{
    public static void main(String[] args)
    {
        Frame up=new Frame();
        up.setSize(1280,720);

        Panel1 p1=new Panel1();
        up.add(p1);
        up.show();

        Panel2 p2=new Panel2();
        up.add(p2);
        up.show();

    }
}


class Panel1 extends Panel
{
    public void paint(Graphics turtle)
{
    turtle.drawLine(123,11,12,12);
    turtle.drawOval(111,114,114,114);
    turtle.setColor(Color.RED);
    turtle.fillOval(111,114,114,114);
}
}




























