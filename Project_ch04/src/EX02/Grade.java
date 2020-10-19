package EX02;

public class Grade {
	int math;
	int science;
	int english;
	
	Grade(int a, int b, int c)
	{
		math=a;
		science = b;
		english = c;
	}
	
	int average() {
		return (math+science+english)/3;
	}
}
