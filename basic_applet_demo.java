import java.applet.*;
import java.awt.*;
/* <applet code=basic_applet_demo width=300 height =50></applet> */

public class basic_applet_demo extends Applet
{
    String msg;
    public void init(){
        setBackground(Color.RED);
        setBackground(Color.WHITE);
        msg="inside init() ----";
    }

    public void start(){
        msg+="inside start() ----";
    }

    public void paint(Graphics g){
        msg+="inside paint";
        g.drawString(msg, 50, 50);
    }
}
