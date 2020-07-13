import javax.swing.*;
import java.awt.*;
public class Login extends JPanel {
	// 스킨
	private Image back;
	private JLabel la1,la2; // ID, pwd
	// Login
	JTextField tf;
	JPasswordField pf;
	JButton b1,b2; // login, 취소
	// MainForm
	public Login() {
//		 이미지 정보 읽기
		back=Toolkit.getDefaultToolkit().getImage("c:\\javaDev\\back.jpg");
		
		setLayout(null); // 직접배치
		la1=new JLabel("아이디",JLabel.RIGHT);
		la1.setBounds(745, 775, 80, 30);
		tf=new JTextField();
		tf.setBounds(830, 775, 150, 30);
		
		add(la1); add(tf);
		
		la2=new JLabel("비밀번호",JLabel.RIGHT);
		la2.setBounds(745, 810, 80, 30);
		pf=new JPasswordField();
		pf.setBounds(830, 810, 150, 30);
		
		add(la2); add(pf);
		
		b1=new JButton("로그인");
		b2=new JButton("취소");
		JPanel p=new JPanel(); // 묶어서 한번에 배치
		p.add(b1);
		p.add(b2);
		p.setOpaque(false); // 투명모드
		
		p.setBounds(745, 850, 235, 35);
		add(p);
	}
	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		g.drawImage(back, 0,0,getWidth(),getHeight(),this);
	}
	
}
