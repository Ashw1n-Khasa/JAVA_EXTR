import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/* <applet code=MouseEvents width=300 height =300></applet> */


public class MouseEvents extends Applet implements MouseListener,MouseMotionListener
{
    String msg="";
    int mouseX=0,mouseY=0;

    public void init(){
        addMouseListener(this);
        addMouseMotionListener(this);
    }
    
    public void mouseClicked(MouseEvent e ){
        mouseX=10;
        mouseY=10;
        msg="mouse clicked";
        showStatus("clicked mouse at "+e.getX()+" , "+e.getY());
        repaint();
    }

    public void mouseEntered(MouseEvent e){
        mouseX=0;
        mouseY=10;
        msg="mouse entered";
        repaint();
    }

    public void mouseExited(MouseEvent e){
        mouseX=0;
        mouseY=10;
        msg="mouse exited";
        repaint();
    }

    public void mouseReleased(MouseEvent me){
        mouseX=me.getX();
        mouseY=me.getY();
        msg="up";
        repaint();
    }

    public void mousePressed(MouseEvent me){
        mouseX=me.getX();
        mouseY=me.getY();
        msg="down";
        repaint();
    }

    public void mouseDragged(MouseEvent me){
        mouseX=me.getX();
        mouseY=me.getY();
        msg="dragging";
        showStatus("Draggin mouse at "+mouseX+" , "+mouseY);
        repaint();
    }

    public void mouseMoved(MouseEvent me){
        showStatus("Moving mouse at :- "+me.getX()+" , "+me.getY());
    }

    public void paint(Graphics g){
        g.drawString(msg,mouseX,mouseY);
    }

}
