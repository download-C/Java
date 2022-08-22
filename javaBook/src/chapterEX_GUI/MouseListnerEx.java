package chapterEX_GUI;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MouseListnerEx extends JFrame{
	MouseListnerEx() {
		setTitle("Mouse Test1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 200);
		
		JButton btn1 = new JButton("마우스 이벤트 테스트 버튼"); // 버튼 정의
		setLayout(new FlowLayout());  // 버튼 배치 방식 정의
		btn1.setBackground(Color.yellow);  // 버튼 배경색 정의
		add(btn1); // 버튼 삽입
		btn1.addMouseListener(new MouseListener() {  // 버튼과 관련된 이벤트 리스너 정의
			Color bgc = btn1.getBackground();
			@Override
			public void mouseReleased(MouseEvent e) {}
			@Override
			public void mousePressed(MouseEvent e) {}
			
			@Override
			public void mouseExited(MouseEvent e) {  // 마우스가 버튼에서 내려왔을 때
				btn1.setBackground(Color.yellow);
			}
			@Override
			public void mouseEntered(MouseEvent e) {  // 마우스가 위로 올라갔을 때
				btn1.setBackground(Color.red);
			} 
			@Override
			public void mouseClicked(MouseEvent e) {}
		});
		
		setVisible(true);  // 버튼 보이기
	}

	public static void main(String[] args) { 
		new MouseListnerEx();  // GUI 호출
	}

}
