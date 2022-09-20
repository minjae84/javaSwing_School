package m0906;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class HelloFlowlayout extends JFrame {
	HelloFlowlayout(){
		
		JPanel p = new JPanel();
		p.setBackground(Color.pink);
		add(p);
		
		JButton btn = new JButton("버튼1");
		JButton btn2 = new JButton("버튼2");
		JButton btn3 = new JButton("버튼3");
		JButton btn4 = new JButton("버튼4");
		JButton btn5 = new JButton("버튼5");
		JButton btn6 = new JButton("버튼6");
		JButton btn7 = new JButton("버튼7");
		
		p.setLayout(new FlowLayout());
		p.add(btn);
		p.add(btn2);
		p.add(btn3);
		p.add(btn4);
		p.add(btn5);
		p.add(btn6);
		p.add(btn7);
		
		setTitle("플로우 레이아웃");
		setSize(300, 200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
	}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new HelloFlowlayout();
	}

}
