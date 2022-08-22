package chapterEX_GUI;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MouseListnerEx2 extends JFrame{
	
	MouseListnerEx2() { //생성자
		setTitle("마우스 이벤트 테스트");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Content 위치에 패널 올리기
		JPanel panel = new JPanel();		 // JPanel 객체 생성
		setContentPane(panel);			 	 // 객체 위치 설정
		setLayout(null);  				 	 // 레이아웃 설정했지만 눈에 안 보이게
		
		// Label(글자, 그림 등 패널 위에 올라가는 것) 넣기
		JLabel  label = new JLabel("hello"); // JLabel 객체 생성
		label.setLocation(50, 50);			 // 라벨에 생성될 위치
		label.setSize(30,10);				 // 라벨의 크기
		panel.add(label);					 // 라벨 삽입
		panel.addMouseListener(new MouseAdapter() {  // 어댑터 클래스 사용시 원하는 메서드만 구현 가능
			@Override
			public void mousePressed(MouseEvent e) { // 마우스 버튼을 눌렀을 때 발생하는 이벤트 처리 방식 정의
				int x = e.getX();
				int y = e.getY();
				label.setLocation(x, y);		     // label을 사용하기 위해서는 변수 선언을 먼저 해야 함.
			}
		}); // 마우스리스너가 처리하는 항목 가져오기
			
			
		
		setSize(300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MouseListnerEx2();
	}

}
