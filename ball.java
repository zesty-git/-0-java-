import java.awt.*;
public class ball{
    public static void main(String[] args)
    {
        Frame w=new Frame();
        w.setBackground(Color.YELLOW);
        w.setSize(640,460);//窗体

        Ball ball=new Ball();

        w.add(ball);
        Thread trd=new Thread(ball);
        trd.start();
        w.show();
    }
}
class Ball extends Panel implements Runnable
{
    int xposition=300;
    int yposition=60;
    public void paint(Graphics ball)
    {
            ball.fillOval(xposition, yposition, 20, 20);
    }


    public void run()
    {
        while(true) {
            yposition++;
            if(yposition>460)
            {
                yposition=0;
            }
            try{
                Thread.sleep(50);
            }
            catch (Exception e){

            }
            repaint();
        }
    }
}
