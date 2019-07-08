import java.awt.*;
import java.applet.*;
public class Mobile extends Applet implements Runnable
{
String msg="Designed by Abinas Behera....";
Thread t=null;
int state;
volatile boolean stopFlag;
public void init()
{ setForeground(Color.blue);
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
Color c=new Color(255,204,51);
Color c1=new Color(102,102,102);
Color c2=new Color(51,51,51);
Color c3=new Color(0,0,0);
char ch;
ch=msg.charAt(0);
msg=msg.substring(1, msg.length());
msg+=ch;
Font f=new Font("Arial",Font.BOLD,45);
m.setFont(f);
m.drawString(msg,700,800);
m.setColor(c);
m.drawRoundRect(100,20,500,900,100,100);//back model
m.fillRoundRect(100,20,500,900,100,100);
m.setColor(c);
m.drawRoundRect(900,20,900,500,100,100);//back model
m.fillRoundRect(900,20,900,500,100,100);//back model
m.setColor(c1);
m.drawRoundRect(85,40,500,920,100,100);//front model
m.fillRoundRect(85,40,500,920,100,100);//front model
m.setColor(c2);
m.drawRoundRect(280,50,150,10,5,5);//speaker
m.fillRoundRect(280,50,150,10,5,5);
m.setColor(c2);
m.drawOval(240,47,20,20);//front camera
m.fillOval(240,47,20,20);
m.drawOval(450,47,20,20);
m.fillOval(450,47,20,20);//eye
m.drawRoundRect(220,40,260,30,20,20);
m.drawRoundRect(80,40,500,900,100,100);//front inside model
//m.fillRoundRect(80,40,500,900,100,100);

m.drawRoundRect(1470,40,300,100,100,100);
//m.fillRoundRect(1470,40,300,100,100,100);//back
m.setColor(c3);
m.drawOval(1475,45,90,90);
m.fillOval(1475,45,90,90);
m.drawOval(1575,45,90,90);
m.fillOval(1575,45,90,90);
m.drawOval(1675,45,90,90);
m.fillOval(1675,45,90,90);

}
}
