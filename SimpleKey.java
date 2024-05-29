import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.applet.*;

/* <applet code=SimpleKey width=300 height =300></applet> */

public class SimpleKey extends Applet implements KeyListener 
{
    String msg;
    int X=10,Y=20;
    
    public void init(){
        addKeyListener(this);
        requestFocus();
    }

    public void keyPressed(KeyEvent ke){
        showStatus("key Down");
    }

    public void keyReleased(KeyEvent ke){
        showStatus("Key released");
    }

    public void keyTyped(KeyEvent ke){
        msg+=ke.getKeyChar();
        repaint();
    }

    public void paint(Graphics g){
        g.drawString(msg, X, Y);
        
    }
}
