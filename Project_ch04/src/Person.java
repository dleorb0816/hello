
//1.Ŭ���� �����(Ŭ���� ����(define)
class Person 
{
	//1-1.������� �����(���� ����, declare)
	private String name;
	private int	age;
	private float height;
	
	//1-2.������ (�޼ҵ�) �����(define).. ������ ���� �ϴ���.
	//�޼ҵ��̴�. ���� Ư����(���� �����ִ� 1.��ȯ ��ü�� ����. 2.�޼ҵ��̸��� Ŭ���� �̸��� �Ȱ��� ����Ѵ�.
	Person()//������ ��������� �ʱⰪ�� �ִµ� "���"�Ѵ�! �� ���� ��ü�� ���鶧 "���"�Ѵ�.
	{
		name = "ȫ�浿";
		age = 28 ;
		height = 169.4f;
	}
	
	//1-3.(�Ϲ�) �޼ҵ� �����(define)
	void setAge(int a)
	{
		age = a;
	}
	
	void setName(String name)
	{
		this.name = name;
	}
	
	public int getAge() 
	{
		return age;
	}

	
	String getName()
	{
		return name;
	}
	

	
}
