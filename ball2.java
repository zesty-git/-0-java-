import java.awt.*;
public class ball2{
    public static void main(String[] args)
    {
        Frame w=new Frame();
        w.setBackground(Color.BLACK);
        w.setSize(720,1280);
        PanelBall pb=new PanelBall();
        w.add(pb);
        w.show();
        Thread t=new Thread(pb);
        t.start();
    }
}
class PanelBall extends Panel implements Runnable
{
     int x=690;//define location of x position
     int y=0;//define location of y opsition
     int fs=0;//fs=flying style，0=↘，1=↗，2=↖，3=↙
    public void paint(Graphics ball)
    {
        ball.setColor(Color.YELLOW);
        ball.fillOval(x,y,40,40);
    }//draw a ball
    public void run()
    {
        while(true)
        {
            //following codes are in charge of the change of fs
            if(y>1250)
            {
                        if(fs==0)
                        {
                            fs=1;
                        }else{
                            fs=2;
                        }
                    }
            if(x>600)
            {
                        if(fs==1)
                        {
                            fs=2;
                        }else{
                            fs=3;
                        }
                    }
            if(x<0)
            {
                        if(fs==2)
                        {
                            fs=3;
                        }else{
                            fs=0;
                        }
            }
            if(y<0)
            {
                        if(fs==3)
                        {
                            fs=0;
                        }else{
                            fs=1;
                        }
                    }
            //above codes are in charge of the change of fs
            //following codes define fs
            if(fs==0)
            {
                x++;
                y++;
            }
            if(fs==1)
            {
                x++;
                y--;
            }
            if(fs==2)
            {
                x--;
                y--;
            }
            if(fs==3)
            {
                x--;
                y++;
            }
                    //using threads
                    try{
                        Thread.sleep(10);
                    }catch (Exception e){}
                    repaint();
        }
    }
}