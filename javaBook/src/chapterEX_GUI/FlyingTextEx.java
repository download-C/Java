package chapterEX_GUI;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FlyingTextEx extends JFrame{
	// 1. 객체 생성시 GUI 생성
	public FlyingTextEx() {
		// 2. GUI의 기본 세팅
		setTitle("움직이는 글자 테스트");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 3. 레이블을 넣기 위한 패널 생성
		JPanel p = new JPanel();
		setContentPane(p);	// content 위에 패널 붙이기
		setLayout(null);    // 레이아웃 고정 X
		
		// 4. 레이블 만들기
		JLabel l = new JLabel("Hello"); // Hello라는 글자의 레이블 생성
		l.setLocation(50, 50); 			// 레이블의 초기 위치
		l.setSize(50, 25);				// 레이블 크기
		p.add(l);						// 패널 위에 l이라는 레이블 생성
		p.addKeyListener(new KeyAdapter() { // 키를 누르면 반응하는 리스너 생성 후 정의하기
			
			
			@Override
			public void keyPressed(KeyEvent e) {
				// 들어온 값이 유니코드인지 아닌지 확인
				int keyCode = e.getKeyCode(); 	// 정수 타입의 키 값 가져오기ㅣ
				switch(keyCode) {
				// 방향키 왼쪽
				case  37:l.setLocation(l.getX()-10, l.getY()); break;
				// 방향키 위쪽
				case  38:l.setLocation(l.getX(), l.getY()-10); break;
				// 방향키 오른쪽
				case  39:l.setLocation(l.getX()+10, l.getY()); break;
				// 방향키 아래
				case  40:l.setLocation(l.getX(), l.getY()+10); break;
				
				}
				
			}
		});
		
		// 5. 패널 위의 라벨에 포커스 맞추기
		p.setFocusable(true);			// 패널에 포커스 두기
		p.requestFocus();				// 포커스가 잡은 값을 반환
		
		// 6. 
		
		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new FlyingTextEx();
	}

}
