

import javax.swing.*;

import com.sun.org.glassfish.gmbal.GmbalException;

import sun.misc.GC;

import java.awt.*;
import java.awt.event.*;
import java.security.PublicKey;


public class GameMain extends JFrame {
    GameView gv=new GameView();
	public GameMain()
    {
    //»ý¼ºÀÚ
		add ("Center",gv);
        setSize(1024, 768);
    	setVisible(true);
    	addKeyListener(this);
    }
	public static void main(String[] args) 
		// TODO Auto-generated method stub
  GameMain gm=new GameMain();
	
	
	public Void keypressed(KeyEvent E) {
		
		if(e.getKeyCode()==KeyEvent.VK_RIGHT)
		{
			gv.x+=5;
			if(gv.x>1024)
				gv.x=0;
		}
		if(e.getKeyCode()==KeyEvent.VK_ESCAPE)
	
	{
			System.exit(0);
	}
	
	
	}
}
