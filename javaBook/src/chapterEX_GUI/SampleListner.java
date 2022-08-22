package chapterEX_GUI;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SampleListner extends JFrame{
	
	SampleListner() {  // 디폴트 생성자
		setTitle("샘플 테스트");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());  // 순차적으로 add()하는 순서에 따라 가로 나열
		setSize(500, 200);
		JButton btn1 = new JButton("Action");  // Action이라는 이름을 가지고 있는 디폴트 생성자의 지역 변수
		add(btn1); // Button 이름을 가지고 있는 버튼 삽입
		btn1.addActionListener(new ActionListener() {  // 버튼 클릭 이벤트를 처리할 수 있도록 AtionListner 인터페이스를 구현하는 익명 클래스 정의  
			@Override
			public void actionPerformed(ActionEvent e) { // e는 OS가 사용자의 액션을 받아서 값을 넣어줌.
				String s = btn1.getText();	
				// System.out.println(s);	-> s(btn1.getText)는 버튼 btn1이 갖고 있는 String 타입의 글자
				
				// 버튼의 글자를 받아서 바꾸기
				if(s.equals("Action")) {
					btn1.setText("액션");
				} else btn1.setText("Action");
			}
		});  
		setVisible(true);
	}

	public static void main(String[] args) {
		new SampleListner();
	}

}
