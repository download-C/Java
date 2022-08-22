package chapter12_generic;

//393쪽 GenericPRinter<T> 클래스 정의하기

public class GenericPrinter<T extends Material> {
	private T material;
	
	public void setMetarial(T metarial) {
		this.material = metarial;
	}

	public T getMetarial() {
		return material;
	}

	@Override
	public String toString() {
		return material.toString();
	}
	
	public void printing() {
		material.doPrinting();
	}

}
