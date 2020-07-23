package 자바프로젝트;
import java.awt.Color;
import javax.swing.*;
import java.awt.*;

public class TicketForm extends JPanel{
	
	JLabel movieName=new JLabel();
	JLabel movieTime=new JLabel();
	JLabel movieDate=new JLabel();
	
	public TicketForm()
	{	
		setLayout(null);
		
		movieName.setBounds(x, y, width, height);
		setBackground(Color.pink);
	}
}
