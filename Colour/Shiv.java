import java.awt.*;
import java.applet.*;
public class Shiv extends Applet 
{
public void paint(Graphics m)
{
Color c=new Color(0,0,0);
Color c2=new Color(204,0,0);
Color c1=new Color(255,255,255);

m.setColor(c);
m.drawRoundRect(500,100,200,400,500,100);
m.fillRoundRect(500,100,200,400,500,100);

m.setColor(c1);
m.drawRoundRect(517,238,175,90,30,30);//Outer rect
m.fillRoundRect(517,238,175,90,30,30);


m.setColor(c);
m.drawRoundRect(530,250,150,15,20,20);//upper1inner
m.fillRoundRect(530,250,150,15,20,20);

m.setColor(c);
m.drawRoundRect(530,300,150,15,20,20);//down1inner
m.fillRoundRect(530,300,150,15,20,20);





m.setColor(c);
m.drawRoundRect(525,245,160,24,30,30);//upper outer circle2
m.fillRoundRect(525,245,160,24,30,30);

m.setColor(c);
m.drawRoundRect(525,295,160,24,30,30);//down outercircle2
m.fillRoundRect(525,295,160,24,30,30);//r4outer

m.setColor(c);
m.drawRoundRect(525,285,160,33,30,30);//down outercircle
m.fillRoundRect(525,285,160,33,30,30);

m.setColor(c);
m.drawRoundRect(525,245,160,33,30,30);//upper outer circle 
m.fillRoundRect(525,245,160,33,30,30);

m.setColor(c1);
m.drawRoundRect(525,245,160,75,30,30);//upper circle1
//m.fillRoundRect(525,245,160,75,30,30);

m.setColor(c1);
m.drawOval(585,265,33,33);
m.fillOval(585,265,33,33);

m.setColor(c2);
m.drawOval(590,270,25,25);
m.fillOval(590,270,25,25);

m.setColor(c);
m.drawOval(200,400,800,100);
m.fillOval(200,400,800,100);
m.drawRoundRect(180,450,840,100,30,80);
m.fillRoundRect(180,450,840,100,30,80);
m.drawOval(200,500,800,100);
m.fillOval(200,500,800,100);




//m.drawRoundRect(500,100,200,100,500,500);
//m.drawRoundRect(580,200,50,150,500,500);



}
}
