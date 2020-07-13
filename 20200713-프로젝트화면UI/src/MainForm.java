/* ��� ����
 *   
 *   ������
 *    = Container : Component�� ������ ��� ȭ�� ���
 *      = JFrame
 *      = JWindow (title bar�� ����)
 *      = JDialog
 *     ============ �ܵ����� ���డ��
 *      = JPanel => �ܵ����� ���� �Ұ��� => JFrame, JWindow, JDialog 
 *    = Conponent : �Ѱ��� ��ɸ� ������ �ִ�
 *    		JLabel => �Ϲ� ���ڿ� ���, �̹��� ���
 *    	    ��ư ����
 *    		 = �Ϲ� ��ư
 *    			  JButton
 *    		 = ��� ��ư
 *    			  ���������� ����� �ٲ�� ��ư
 *    			  JRadioButton
 *    			  JCheckBox
 *     		 = �޴�
 *    		�Է�â
 *    		 = �����Է� : JTextField
 *    		 = ��й�ȣ�Է� : JPasswordField
 *    		 = ������ �Է� : JTextArea => �Ұ�, �������
 *    		 = ������ �Է� : JTextPane => ä��
 *    		���â 
 *     		 = ����â : JComboBox
 *     		 = ��ü ���� ��� : JList
 *     		 = JTree
 *     		 = JTable
 *     		ȭ�����
 *     		 = JTabbedPane
 *     		 = JSplitPane ==> <div>
 *     		 = JInteralFrame  
 *     =====================================================interface
 *     
 *     ==> ��ġ (Layout) , ����� ���� ��ġ
 *     	   1. BorderLayout => 5����
 *     		 	��, �Ʒ�, ���, ����, ������
 *     	   2. FlowLayout
 *     	   3. GridLayout
 *         4. CardLayout
 *         5. ����� ���� ==> setBounds(10,20,800,900)
 *         
 *     ==> ������Ʈ : ��Ʈ��ũ�� �帧 �ľ�
 *     				  Oracle
 *     				  JSP
 *     				  Spring
 *     				  Kotlin
 *         1. �α��� => �������� ����
 *         2. ȸ������
 *        ============================
 *         3. ��� ���
 *         4. �󼼺���
 *         5. ���� or ��ٱ���
 *         6. ����������, ������������
 *         7. ä��     
 *        ============================ 
 */

import javax.swing.*;
import java.awt.*;
/*
 * ���� ==========> �����͸� ����� (����ȭ : private)
 *   �Ϲݺ��� => �⺻��
 *   ======
 *   �迭
 *   Ŭ����
 *   ====== ��������
 * ======== 
 * �޼ҵ�
 * ������
 * ======== �ٸ� Ŭ������ �����ϴ� ���� => public
 */
public class MainForm extends JFrame{	// ���(������ ���� ����)
	private CardLayout card=new CardLayout(); // ����Ŭ���� (������ ���� ����)
	// ȭ�� UI => ������ => �����ϸ� �ٷ� ��������ϱ� ����
	// ������ => �ѹ��� ȣ���� �����ϰ� ���۰� ���ÿ� ȣ��Ǵ� �޼ҵ�
	// �����ڴ� ��� Ŭ�������� ȣ���� �����ؾ� �Ѵ� => public
	Login login=new Login(); //����Ŭ����
	public MainForm() { // ������
		// Layout ����
		setLayout(card); // �������� ȭ��
		add("LOGIN",login);
		/*
		 * JFrame, JWindow, JDialog => BorderLayout
		 * JPanel => FlowLayout
		 * 
		 * => ����� ���� ��� ==> setLayout(null)
		 */
		setBounds(400,60,1024,950); // ���ϴ� ��ġ�� ��ﶧ, ���ʿ� �ٿ��� ���� (setSize)
		//setSize(1000,900);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MainForm();
	}

}
