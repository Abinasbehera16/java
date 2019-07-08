import java.awt.*;
import java.applet.*;
import java.awt.geom.Line2D;
public class Temple extends Applet implements Runnable
{
String msg="HAPPY NAVRATRI (^_^) ";
Thread t=null;
int state;
volatile boolean stopFlag;
public void init()
{
setBackground(Color.cyan);
setForeground(Color.red);
}
public void start()
{
t= new Thread(this);
stopFlag=false;
t.start();
}
public void run(){
for( ; ; )
{
try
{
repaint();
Thread.sleep(700);
if(stopFlag)
break;
}
catch(InterruptedException e)
{
}
}
}
public void stop()
{
stopFlag=true;
t=null;
}
public void paint(Graphics m)
{
char ch;
ch=msg.charAt(0);
msg=msg.substring(1, msg.length());
msg+=ch;
Font f=new Font("Arial",Font.BOLD,100);
m.setFont(f);
m.drawString(msg,500,500);
Color c1=new Color(255,255,0);
Color c2=new Color(255,255,255);
Color c3=new Color(255,102,0);
Color c4=new Color(255,0,0);
Color c5=new Color(255,204,0);
Color c6=new Color(102,102,102);
Graphics2D m2D=(Graphics2D) m;
m2D.setColor(c4);
m2D.draw(new Line2D.Double(205,70,400,200));
m2D.draw(new Line2D.Double(205,40,400,200));
m2D.draw(new Line2D.Double(207,40,207,40));
m2D.fill(new Line2D.Double(205,70,400,200));
m2D.fill(new Line2D.Double(205,40,400,200));
m2D.fill(new Line2D.Double(207,40,207,40));
m.setColor(c1);
m.drawRoundRect(100,600,200,200,10,20);//1
m.fillRoundRect(100,600,200,200,10,20);
m.setColor(c3);
m.drawRoundRect(100,250,200,400,100,200);//2
m.fillRoundRect(100,250,200,400,100,200);//2

m.setColor(c6);
m.drawRect(190,40,20,150);
m.fillRect(190,40,20,150);

m.setColor(c5);
m.drawRoundRect(140,170,120,100,50,50);//4
m.fillRoundRect(140,170,120,100,50,50);//4


m.setColor(c2);
m.drawRoundRect(170,680,60,120,30,30);//door
m.fillRoundRect(170,680,60,120,30,30);//door

m.setColor(c1);
m.drawRect(100,350,200,20);
m.fillRect(100,350,200,20);
m.drawRect(100,500,200,20);
m.fillRect(100,500,200,20);

m.setColor(c4);
m.drawOval(100,350,20,20);
m.drawOval(150,350,20,20);
m.drawOval(210,350,20,20);
m.drawOval(260,350,20,20);
m.fillOval(100,350,20,20);
m.fillOval(150,350,20,20);
m.fillOval(210,350,20,20);
m.fillOval(260,350,20,20);


m.drawOval(100,500,20,20);
m.drawOval(150,500,20,20);
m.drawOval(210,500,20,20);
m.drawOval(260,500,20,20);
m.fillOval(100,500,20,20);
m.fillOval(150,500,20,20);
m.fillOval(210,500,20,20);
m.fillOval(260,500,20,20);
}
}
