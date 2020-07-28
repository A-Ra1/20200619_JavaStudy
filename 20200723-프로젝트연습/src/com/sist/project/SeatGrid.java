package com.sist.project;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;



public class SeatGrid extends JFrame implements MouseListener{
	

	
	public SeatGrid() {
		
		setLayout(new GridLayout(5, 5, 25, 25));
		
		for(int i=1; i<=50; i++) {
			
			add(new JButton("ÁÂ¼®"+i));
		}

		setSize(1000,700);
		setVisible(true);
	}


  public static void main(String[] args) {
	
	  new SeatGrid();
}


@Override
public void mouseClicked(MouseEvent e) {

	
}


@Override
public void mousePressed(MouseEvent e) {
	// TODO Auto-generated method stub
	
}


@Override
public void mouseReleased(MouseEvent e) {
	// TODO Auto-generated method stub
	
}


@Override
public void mouseEntered(MouseEvent e) {
	// TODO Auto-generated method stub
	
	
}


@Override
public void mouseExited(MouseEvent e) {
	// TODO Auto-generated method stub
	
}

}
