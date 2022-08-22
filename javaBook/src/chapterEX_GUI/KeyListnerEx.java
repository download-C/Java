package chapterEX_GUI;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class KeyListnerEx extends JFrame {
	
	JPanel panel = new JPanel(); 
	JLabel[] label;
	
	public KeyListnerEx() { 	// 객체 생성 시 GUI 생성되도록 정의
		setTitle("키 리스너 테스트");	// GUI 이름
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //GUI 끄기
		
		setContentPane(panel);
		panel.addKeyListener(new KeyAdapter() {  		// 리스너로 키 이벤트 처리
			@Override
			public void keyPressed(KeyEvent e) { 	 	 // 키를 눌렀을 때 키 이벤트 처리0
				int keyCode = e.getKeyCode();	 		 // 누른 키의 유니코드값 반환
				char keyChar = e.getKeyChar();			 // 누른 키의 문자 반환
				label[0].setText(Integer.toString(keyCode));  // 누른 키의 문자열 또는 대문자 반환
				label[1].setText(Character.toString(keyChar));
				label[2].setText(KeyEvent.getKeyText(keyCode));
				
			}
		});
				
		label = new JLabel[3];		
		label[0]= new JLabel("getKeyCode()");
		label[1] = new JLabel("getKeyChar()");
		label[2]= new JLabel("getKeyText()");
		
		for(int i=0; i<label.length; i++) {
			panel.add(label[i]);
			label[i].setOpaque(true); // 배경색 유무
			label[i].setBackground(Color.cyan); // 배경색 시안으로 설정
		}
				
		setSize(300, 300);	// GUI 사이즈
		setVisible(true);	// GUI 가시화
		panel.add(label[0]);
		panel.add(label[1]);
		panel.add(label[2]);
		
		panel.setFocusable(true); // 사용자가 누른 키에 포커스 할지 여부
		panel.requestFocus(); 	  // 포커스한 키 반응하기
	}
	
	public static void main(String[] args) {
		new KeyListnerEx();
	}

}
