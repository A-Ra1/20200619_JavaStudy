package com.sist.client;
// ������ => JFrame
// ������� ���õ� Ŭ������ �о�´�
import javax.swing.*; 
import java.awt.*; // Color, Layout (��ġ)
import java.awt.event.*; // interface
/*
 *  ����
 *   = ��� (is-a) : ������ Ŭ������ �����ؼ� ���
 *   public class ClientMainFrame extends JFrame
 *   			 =================
 *   			 JFrame�� ����� ��ü �� ������ �´�
 *   = ���� (has-a) : ������ Ŭ������ �������� �ʰ� ���
 */
public class ClientMainFrame extends JFrame implements ActionListener, MouseListener{
	// ������ ũ�� ���� => ���� ��κ� �����ڿ��� ��� (291page)
	
	JLabel title=new JLabel("��ȭ ���� & ��õ ���α׷�", JLabel.CENTER);
	
	MenuForm mf=new MenuForm();
	ChatForm cf=new ChatForm();
	ControlPanel cp;
	int curpage=1;
	int totalpage=16;
	
	public ClientMainFrame() {
		/*
		 *  Ŭ�������� ������ ��� => ������ �ƴ϶� �����Ҷ�
		 *  ��) 
		 *  	�����ͺ��̽� : ����Ŭ���� (�����ڿ���)
		 *  	��Ʈ��ũ : ���� => IP, PORT ����
		 *  	�� : ��Ű���� �� �б� => �ڵ��α���
		 */
	cp=new ControlPanel(this);	
	// this ~ ���ο� â=> ���� �������� ������â�� ����
	
	title.setFont(new Font("����ü", Font.BOLD, 55));
	// title.setOpaque(true);
	// title.setBackground(Color.magenta);
	setLayout(null);	// JFrame (BorderLayout) ==> ����� ���Ƿ� ��ġ (null)
	title.setBounds(10, 15, 1570, 100);
	
	// ������ �߰� => add()
	add(title);
	
	// �޴���ġ
	mf.setBounds(10, 120, 100, 300); 
	add(mf);
	
	// ä����
	cf.setBounds(115, 760, 1465, 200);
	add(cf);
	
	// ���ȭ��
	cp.setBounds(115, 120, 1465, 635);
	add(cp);
	
	setSize(1600, 1000);
	setVisible(true);
	setDefaultCloseOperation(EXIT_ON_CLOSE); // X��ư Ŭ���� ����
	
	mf.b1.addActionListener(this);
	mf.b2.addActionListener(this);
	mf.b5.addActionListener(this);
	
	cp.ff.b1.addActionListener(this); // ������ư
	cp.ff.b2.addActionListener(this); // ������ư
	
	cp.df.b2.addActionListener(this); // �������
	
	cp.lf.b1.addActionListener(this);
	cp.lf.b2.addActionListener(this);
	cp.lf.b3.addActionListener(this);
	cp.lf.b4.addActionListener(this);
	cp.lf.b5.addActionListener(this);
	cp.lf.b6.addActionListener(this);
	cp.lf.tf.addActionListener(this);
	
	
	for(int i=0; i<10; i++) {
		
		cp.ff.mc[i].addMouseListener(this);
		
	 }
	}
	
	public static void main(String[] args) throws Exception {
 
		// �����ڴ� ȣ��ÿ� �ݵ�� => new ������()
		UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
		new ClientMainFrame();
	}

	public static Image getImage(ImageIcon ii,int w,int h) {
	      Image dimg=ii.getImage().getScaledInstance(w, h, Image.SCALE_SMOOTH);
	      return dimg;
	   }
	
	
	@Override
	public void actionPerformed(ActionEvent e) {

		if(e.getSource()==mf.b1) { // ȭ�� ��ȯ mf-�޴��� b1-Ȩ  
			cp.card.show(cp, "FF");
		}
		else if(e.getSource()==mf.b2) {
			cp.card.show(cp, "LF");
		}
		else if(e.getSource()==mf.b5) {
			cp.card.show(cp, "NF");
		}
		else if(e.getSource()==cp.df.b2) {
			cp.card.show(cp, "FF");
		}
		else if (e.getSource()==cp.ff.b1) {
			
			if(curpage>1) {
				
				curpage--;
				cp.ff.p.removeAll(); // Jpanel�� ��� ����� ����
				cp.ff.moviePrint(curpage);
				cp.ff.repaint(); // paint �ٽ� ȣ��
				cp.ff.p.validate(); // Jpanel�� ���� ����� ���ġ
			}
		}
		else if (e.getSource()==cp.ff.b2) {
	
			if(curpage<totalpage) {
				
				curpage++;
				cp.ff.p.removeAll();
				cp.ff.moviePrint(curpage);
				cp.ff.repaint();
				cp.ff.p.validate();
			}
		}
		
		else if(e.getSource()==cp.lf.b1) {
			cp.lf.movieAllData(1);
		}
		else if(e.getSource()==cp.lf.b2) {
			cp.lf.movieAllData(2);
		}
		else if(e.getSource()==cp.lf.b3) {
			cp.lf.movieAllData(3);
		}
		else if(e.getSource()==cp.lf.b4) {
			cp.lf.movieAllData(4);
		}
		else if(e.getSource()==cp.lf.b5) {
			cp.lf.movieAllData(5);
		}
		else if(e.getSource()==cp.lf.b6 || e.getSource()==cp.lf.tf) {
			
			// 1.�Էµ� �� �б�
			String ss=cp.lf.tf.getText();
			if(ss.length()<1) {
				JOptionPane.showMessageDialog(this, "�˻�� �Է��ϼ���");
				cp.lf.tf.requestFocus(); // Ŀ�� �÷�����
				return; // �޼ҵ� ����
			}
			cp.lf.movieFindData(ss);
			
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {

		for(int i=0; i<10; i++) {
			if(e.getSource()==cp.ff.mc[i]) {
				if(e.getClickCount()==2) {
					int a=(i+1)+((curpage*10)-10);
					//JOptionPane.showMessageDialog(this, "mno="+a);
					cp.df.detailPrint(a);
					cp.card.show(cp, "DF"); //df�� cp���� ����
					break;
				}
			}
		}
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
