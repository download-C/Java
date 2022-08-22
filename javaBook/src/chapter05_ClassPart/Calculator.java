package chapter05_ClassPart;

public class Calculator {

	public int a;
	public int b;
		
	public void setNum(int aa, int bb) {
		this.a = aa;
		this.b = bb;
		return;
	} 
	
	public void add() {
		System.out.println("add "+(a+b));
		return;
	} 
	
	public void sub() {
		System.out.println("sub "+(a-b));
		return;
	}
	
	public void mul() {
		System.out.println("mul "+(a*b));
		return;
	}
	
	public void div() {
		System.out.println("div "+(a/b));
		return;
	}
	
}
