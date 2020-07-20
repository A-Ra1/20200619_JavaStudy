package com.sist.client;
import java.awt.*;
import javax.swing.*;
public class ControlPanel extends JPanel{ //화면추가 : JPanel (JFrame X)
		
	CardLayout card=new CardLayout();
	ListForm lf=new ListForm();
	DetailForm df=new DetailForm();
	FoodCategoryForm ff=new FoodCategoryForm();
	
	public ControlPanel() {
		setLayout(card);
		add("FF",ff);
		add("LF",lf);
		add("DF",df);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
