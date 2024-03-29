package unit03.event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


//소스 변경

public class TextAreaEx extends JFrame implements ActionListener {
	
	JLabel lb = new JLabel("입력 후 <Enter> 키를 입력하세요.");
	JTextField tf = new JTextField(20);
	
	JTextArea ta = new JTextArea(7,20);
	JScrollPane sp = new JScrollPane(ta);
	
	
	public TextAreaEx(){
		JPanel p = new  JPanel();
		add(p);
		p.add(lb);
		p.add(tf);
		p.add(sp);
		
		tf.addActionListener(this);
		
		setTitle("텍스트 영역 만들기");
		setSize(300,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	public static void main(String[] args) {
		new TextAreaEx();

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == tf) {
			String str = tf.getText()+"\n";
			ta.append(str);
			tf.setText("");
		}
		
	}

}
