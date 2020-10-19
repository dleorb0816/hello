package ex5_7;

public class GoodCalc extends Calculator {
	public int add(int a, int b) {
		return a +b;
	}

	@Override
	public int substract(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}
	
	@Override
	public double average(int[] a) {
		double sum = 0;
		for(int i =0; i<a.length; i++)
			sum +=a[i];
		return sum/a.length;
	}

	public static void main(String[] args) {
		GoodCalc c = new GoodCalc();
		System.out.println(c.add(2, 3));
		System.out.println(c.substract(2, 3));
		System.out.println(c.average(new int[] {2,3,4}));
	}

	


}
