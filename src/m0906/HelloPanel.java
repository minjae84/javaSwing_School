package m0906;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class HelloPanel extends JFrame { 
	HelloPanel(){
		
		JPanel p = new JPanel();
		p.setBackground(Color.pink);
		add(p);
		
		JButton btn = new JButton("��ư1");
		p.add(btn);
		
		JButton btn2 = new JButton("��ư2");
		p.add(btn2);
		
		setTitle("�ȳ� ��ư");
		setSize(300, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		btn.setBackground(Color.yellow);
		btn2.setBackground(Color.magenta);
		setVisible(true);
		
	}	
	public static void main(String[] args) {
		new HelloPanel();

	}

}
