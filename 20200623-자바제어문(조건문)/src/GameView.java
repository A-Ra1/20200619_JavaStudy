import javax.swing.*;
import java.awt.*;


public class GameView {
Image back,air;
int x=15, y=15;
 
 public GameView()
{
	//이미지를 가지고온다
	
	back=Toolkit.
			getDefaultToolkit().
			getImage("c:\\javaDev\\back.png");
	air=Toolkit.
			getDefaultToolkit().
			getImage("c:\\javaDev\\air.jpg");
     }
	public void paint(Graphics g)
	{
	g.drawImage(back,  0,  0,  getWidth(), getHeight(), this);
	g.drawImage(air, 15, 15, 80, 50, this);
	}
	
    }
			
	  
			
	

