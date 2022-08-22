package polymorphism;

//intanceof로 원래 형 확인 후 다운 캐스팅하기

import java.util.ArrayList;

class Animal {
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}






class Human extends Animal {

	@Override
	public void move() {
		System.out.println("사람이 두 발로 걷습니다.");
	}
	
	public void reading() {
		System.out.println("사람이 책을 읽습니다.");
	}
	
}







class Tiger extends Animal {

	@Override
	public void move() {
		System.out.println("호랑이가 네 발로 뜁니다.");
	}
	
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
	
}







class Eagle extends Animal {

	@Override
	public void move() {
		System.out.println("독수리가 하늘을 납니다.");
	}
	
	public void flying() {
		System.out.println("독수리가 날개를 펴고 날아갑니다.");
	}
	
}






public class AnimalTest2 {
	
	ArrayList<Animal> aniList = new ArrayList<Animal>();
	
	public void addAnimal() {
		aniList.add(new Human());
		aniList.add(new Tiger());
		aniList.add(new Eagle());
		
		for(Animal ani: aniList) {
			ani.move();
		}
	}
	
	public void testCasting() {
		for(int i=0; i<aniList.size(); i++) {
			Animal ani = aniList.get(i);
			if(ani instanceof Human) {
				Human h = (Human)ani;
				h.reading();
			}else if(ani instanceof Tiger) {
				Tiger t = (Tiger)ani;
				t.hunting();
			}else if(ani instanceof Eagle) {
				Eagle e = (Eagle)ani;
				e.flying();
			}else {
				System.out.println("지원되지 않는 형입니다.");
			}
		}
	}

	public static void main(String[] args) {
		
		AnimalTest2 aTest2 = new AnimalTest2();
		System.out.println("===== 상속과 오버라이딩을 통한 문장 출력 =====");
		aTest2.addAnimal();
		System.out.println();
		System.out.println("=========== 원래 형으로 다운 캐스팅 ===========");
		aTest2.testCasting();
		
	}
	
}
