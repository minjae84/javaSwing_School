package m0906;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class HelloButton2 extends JFrame {
	 
	HelloButton2(){
		
		JPanel p = new JPanel();
		p.setBackground(Color.blue);
		add(p);
		
		JButton btn = new JButton("��ư");
		p.add(btn);
		
		setTitle("�ȳ� ��ư");
		setSize(300, 100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setVisible(true);
		
	}

	public static void main(String[] args) {
		new HelloButton2();
	}

}
