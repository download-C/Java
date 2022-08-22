package chapter11_Class;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

// String 클래스 정보 가져오기

public class StringClassTest {

	public static void main(String[] args) throws ClassNotFoundException {
		// Class 클래스 이름 가져오기
		Class strClass = Class.forName("java.lang.String");
		
		
		// Class 클래스의 모든 생성자 가져오기
		Constructor[] cons = strClass.getConstructors();
		for(Constructor c: cons) {
			System.out.println(c);
		}
		
		// Class 클래스의 모든 멤버 변수 가져오기
		Field[] fields = strClass.getFields();
		for(Field f: fields) {
			System.out.println(f);
		}
		
		// Class 클래스의 모든 메서드 가져오기
		Method[] methods = strClass.getMethods();
		for(Method m: methods) {
			System.out.println(m);
		}
	}

}


