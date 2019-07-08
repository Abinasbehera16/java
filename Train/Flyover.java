import java.awt.*;
import java.applet.*;
public class Flyover extends Applet implements Runnable
{
String msg="NAMO NAMO EXPRESS";
Thread t=null;
int state;
volatile boolean stopFlag;
public void init()
{
//setBackground(Color.cyan);
//setForeground(Color.red);
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

public void paint(Graphics g)
{
char ch;
ch=msg.charAt(0);
msg=msg.substring(1, msg.length());
msg+=ch;

Color c1=new Color(0,0,0);
Color c2=new Color(255,51,51);
Color c3=new Color(51,204,255);
Color c4=new Color(255,255,0);
Color c5=new Color(51,0,0);
Color c6=new Color(0,153,153);
Color c7=new Color(153,0,0);
Color c8=new Color(153,0,0);
Color c9=new Color(51,51,51);
Color c10=new Color(0,102,0);
Color c11=new Color(255,255,255);
g.setColor(c1);
g.drawRect(0,0,2000,500);
g.fillRect(0,0,2000,500);

g.setColor(c10);
g.drawRect(0,500,2000,500);
g.fillRect(0,500,2000,500);


g.setColor (c1);
//g.drawLine(0,400,2000,400);
g.drawLine(0,500,2000,500);//track

g.setColor (c9);
g.drawOval(50,400,100,100);
g.fillOval(50,400,100,100);//wheel1
g.drawOval(350,400,100,100);
g.fillOval(350,400,100,100);

g.setColor (c9);
g.drawOval(580,400,100,100);//Wheel2
g.fillOval(580,400,100,100);
g.drawOval(900,400,100,100);
g.fillOval(900,400,100,100);

g.setColor (c9);
g.drawOval(1130,400,100,100);//Main Wheel
g.drawOval(1250,400,100,100);
g.drawOval(1370,400,100,100);
g.drawOval(1490,400,100,100);

g.fillOval(1130,400,100,100);//Main Wheel
g.fillOval(1250,400,100,100);
g.fillOval(1370,400,100,100);
g.fillOval(1490,400,100,100);

g.fillRect(1120,450,500,10);

g.setColor(c2);
g.drawRoundRect(0,250,500,150,45,45);//coaches
g.drawRoundRect(560,250,500,150,45,45); 


g.fillRoundRect(0,250,500,150,45,45);//coaches
g.fillRoundRect(560,250,500,150,45,45); 

g.setColor(c3);
g.drawRoundRect(10,270,60,120,30,30);//Door1
g.drawRoundRect(420,270,60,120,30,30);

g.drawRoundRect(580,270,60,120,30,30);//Door2
g.drawRoundRect(980,270,60,120,30,30);

g.fillRoundRect(10,270,60,120,30,30);//Door1
g.fillRoundRect(420,270,60,120,30,30);

g.fillRoundRect(580,270,60,120,30,30);//Door2
g.fillRoundRect(980,270,60,120,30,30);

g.drawRoundRect(100,300,60,50,15,15);//window1
g.drawRoundRect(200,300,60,50,15,15);
g.drawRoundRect(300,300,60,50,15,15);

g.drawRoundRect(650,300,60,50,15,15);//window2
g.drawRoundRect(750,300,60,50,15,15);
g.drawRoundRect(850,300,60,50,15,15);

g.setColor(c4);
g.fillRoundRect(100,300,60,50,15,15);//window1
g.fillRoundRect(200,300,60,50,15,15);
g.fillRoundRect(300,300,60,50,15,15);

g.fillRoundRect(650,300,60,50,15,15);//window2
g.fillRoundRect(750,300,60,50,15,15);
g.fillRoundRect(850,300,60,50,15,15);

g.setColor(c9);
g.drawLine(1150,220,1250,250);//supply
g.drawLine(1147,220,1250,200);

g.setColor(c5);
g.drawRect(1100,200,10,300);//pole
g.drawRect(500,200,10,300);

g.fillRect(1100,200,10,300);//pole
g.fillRect(500,200,10,300);



g.setColor(c1);
//g.drawLine(500,500,500,180);
//g.drawLine(510,500,510,190);

g.setColor(c9);
g.drawRect(0,195,2000,10);//wire
//g.drawRect(0,180,2000,0);
//g.fillRect(0,2000,10,10);//wire
g.fillRect(0,195,2000,10);


g.drawArc(90,200,200,700,30,0);

g.setColor(c9);
g.drawRoundRect(500,270,60,120,30,30);//joint
g.drawRoundRect(1060,270,60,120,30,30);
g.fillRoundRect(500,270,60,120,30,30);//joint
g.fillRoundRect(1060,270,60,120,30,30);

g.setColor(c6);
g.drawRoundRect(1120,250,500,150,45,45);//Engine
g.fillRoundRect(1120,250,500,150,45,45);
g.setColor(c7);
g.fillRect(1120,350,500,10);
//g.drawRoundRect(2000,270,60,120,30,30);//Door2
g.setColor(c8);
g.drawRoundRect(1440,270,60,120,30,30);
g.fillRoundRect(1440,270,60,120,30,30);
g.setColor(c4);
g.drawRoundRect(1520,300,60,50,15,15);//window
g.fillRoundRect(1520,300,60,50,15,15);
g.setColor(c11);
g.drawOval(50,50,100,100);
g.fillOval(50,50,100,100);

/*int xpoints[]={200,75,200};
int ypoints[]={200,75,200};
int num=3;
g.drawPolygon(xpoints,ypoints,num);*/

Font f=new Font("Arial",Font.BOLD,25);
g.setFont(f);
g.drawString(msg,95,290);
g.drawString(msg,660,290);
g.drawString(msg,1130,290);


}}