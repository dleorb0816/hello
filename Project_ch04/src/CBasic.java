
public class CBasic 
{
	public static void main(String[] args) 
	{
		//2.Person Ŭ���� "���"
		int p2;
		//Ŭ������ ��ü������ ����µ� "���"�Ѵ�!
		Person p1;//p1������ "��ü����"��� �Ѵ�. ��ü�� �� �ȳ�! �̻�~!
		p1 = new Person(); //new�� ������-> ��ü , ��ü�� p1�� ������ �ϻ�! ��ü�� �ȴ�
		//p1 ��ü "�����"
		
//		System.out.println(p1.age);//��ü ���( ����ϴµ��ٰ�)
		System.out.println(p1.getAge());//��ü ���( ����ϴµ��ٰ�)
		
		Person p3 = new Person();//p3 ��ü "�����"
		
//		p1.age = 51;//��ü "���"�ϱ� - ��ü�� "��� ����"�� "����ϱ�"
		p1.setAge(51);
		
		System.out.println(p1.getName());
//		p1.name = "������";
		p1.setName("������");
		
		System.out.println(p1.getName());
		
		
//		System.out.println(p1.age);
		System.out.println(p1.getAge());
		
		//��ü ���, ��ü�� "�޼ҵ�" ���
		p1.setAge(53);//�޼ҵ� ���
//		System.out.println(p1.age);//��� ���� ���
		System.out.println(p1.getAge());//��� ���� ���
		
	}
}
