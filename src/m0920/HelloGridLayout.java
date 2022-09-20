package m0920;


import java.awt.*;

import javax.swing.*;


public class HelloGridLayout extends JFrame {
	
	HelloGridLayout(){
		
		JPanel p =new JPanel();
		add(p);
		
		JButton btn1 = new JButton("버튼1");
		JButton btn2 = new JButton("버튼2");
		JButton btn3 = new JButton("버튼3");
		JButton btn4 = new JButton("버튼4");
		JButton btn5 = new JButton("버튼5");
		JButton btn6 = new JButton("버튼6");
		JButton btn7 = new JButton("버튼7");
		
	
		p.setLayout(new GridLayout(0,2,10,10));
		
		p.add(btn1);
		p.add(btn2);
		p.add(btn3);
		p.add(btn4);
		p.add(btn5);
		p.add(btn6);
		p.add(btn7);
		
		
		
		setTitle("그리드 레이아웃");
		setSize(350,200);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public static void main(String[] args) {
		new HelloGridLayout();
	}

}
