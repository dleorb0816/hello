package EX04;

public class Rectangle {
	int x;
	int y;
	int width;
	int height;
	
	Rectangle(int a, int b, int c, int d)
	{
		this.x = a;
		this.y = b;
		this.width = c;
		this.height = d;
	}
	
	int square() {
		return width * height;
	}
	
	void show() {
		System.out.println("("+x+","+y+")에서 크기가 " + width +"x"+height+"인 사각형");
	}
	
	boolean contains(Rectangle r) {
		if(x<r.x && y<r.y) {
			if((x + width)>(r.x + r.width) && (y+height)>(r.y + r.height)) {
				return true;
			}
		}
		return false;
	}
}
