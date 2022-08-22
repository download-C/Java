package chapter10_7;

public interface Sort {
	void ascending(int[] arr);
	void descending(int[] arr);
	default void description() {}
}
