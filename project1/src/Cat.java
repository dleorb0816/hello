
public class Cat{
	
	//Ŭ������ ������ 3����
	
	//1.������� -���°��� ����
	int num_of_leg;
	float weight;
	String name;
	
	//2.������(�޼ҵ�) -��������� �ʱⰪ�� �����Ѵ�
	Cat() { //��ȯ�� ����
		num_of_leg = 4;
		weight = 0.0f;
	}
	
	//3.(�Ϲ�)�޼ҵ�-����
	void printCat( ) {
		System.out.println("����� �ٸ� ������ ? "+ num_of_leg);
	}
	
	void runCat() {
		System.out.println("����̰� �޸���");
	}

}
