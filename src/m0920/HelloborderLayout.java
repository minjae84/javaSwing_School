package m0920;

import java.awt.*;

import javax.swing.*;


public class HelloborderLayout extends JFrame {

	HelloborderLayout() {
		
		JPanel p = new JPanel();
		add(p);
		p.setLayout(new BorderLayout());
		
		setTitle("���� ���̾ƿ�");
		setSize(350, 200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		JButton btn1 = new JButton("��ư1");
		JButton btn2 = new JButton("��ư2");
		JButton btn3 = new JButton("��ư3");
		JButton btn4 = new JButton("��ư4");
		JButton btn5 = new JButton("��ư5");
		
		p.add(btn1,BorderLayout.NORTH);
		p.add(btn2,BorderLayout.SOUTH);
		p.add(btn3,BorderLayout.EAST);
		p.add(btn4,BorderLayout.WEST);
		p.add(btn5,BorderLayout.CENTER);
		
		
	}
	public static void main(String[] args) {
		new HelloborderLayout();

	}

}
