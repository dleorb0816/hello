package EX01;

public class TV {
	String name;
	int year;
	int inch;
	
	TV(String s, int a, int b){
		this.name = s;
		this.year = a;
		this.inch = b;
	}

	
	void show() {
		System.out.println(name+"���� ���� "+year+"���� "+inch+"��ġ TV");
	}
}
