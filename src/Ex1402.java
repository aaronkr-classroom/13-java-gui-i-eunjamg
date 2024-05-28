import javax.swing.*;
import java.awt.*;
import java.util.Vector;

public class Ex1402 {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		
		// 프레임 설정
		frame.setTitle("My 1st GUI!");
		frame.setSize(600, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// 패널 추가하기
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		frame.add(panel);
		
		// 버튼추가하기
		JButton btn1 = new JButton("img/cola.jpg");
		JButton btn2 = new JButton("img/Fanta.jpg");
		JButton btn3 = new JButton("img/pepsi.jpg");
		
		panel.add(btn1);
		panel.add(btn2);
		panel.add(btn3);
		
		// JcheckBox
		JCheckBox box1 = new JCheckBox("Subsribe to newletters?");
		JCheckBox box2 = new JCheckBox("Receive SMS marketing?", true);
		JCheckBox box3 = new JCheckBox("Receive E-mail marketing?");
		
		panel.add(box1);
		panel.add(box2);
		panel.add(box3);
		
		// JRadioButton
		JRadioButton rbtn1 = new JRadioButton("1학년");
		JRadioButton rbtn2 = new JRadioButton("2학년", true);
		JRadioButton rbtn3 = new JRadioButton("3학년");
		JRadioButton rbtn4 = new JRadioButton("4학년");
		JRadioButton rbtn5 = new JRadioButton("기타");
		
		panel.add(rbtn1);
		panel.add(rbtn2);
		panel.add(rbtn3);
		panel.add(rbtn4);
		panel.add(rbtn5);
		
		// JComboBox
		String email[] = {"naver.com", "google.com", "kakao.com"};
		JComboBox cbox1 = new JComboBox(email);
		panel.add(cbox1);
		
		Vector phone = new Vector();
		phone.add("SKT");
		phone.add("KT");
		phone.add("LG U+");
		
		JComboBox cbox2 = new JComboBox(phone);
		panel.add(cbox2);
		
		// JLabel + JTextArea
		JLabel msg = new JLabel("메세지를 입력하세요: ");
		panel.add(msg);
		
		JTextArea msgTxt = new JTextArea(5, 10);
		panel.add(msgTxt);
		
		// JTextField + JPasswordField
		JLabel unameLbl = new JLabel("username: ");
		panel.add(unameLbl);
		
		JTextField uname = new JTextField(10);
		panel.add(uname);
		
		JLabel pwordLbl = new JLabel("password: ");
		panel.add(pwordLbl);
		
		JPasswordField pword = new JPasswordField(10);
		panel.add(pword);
		
		frame.setVisible(true);
	}
}