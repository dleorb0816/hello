package ex5_7;

abstract class Calculator {
	public abstract int add(int a, int b);

	public abstract int substract(int a, int b);

	public abstract double average(int[] a);

	public int sum(int a, int b) {
		return a + b;
	}

}
