package EX12;

public class Seat {
	private String Seat[];
	
	public Seat() {//�¼� ���� ����
		Seat= new String[10];
		for(int i = 0; i<Seat.length;i++) {
			Seat[i]="---";
		}
	}
	
	public void show() {//�¼� ���� ���
		for(int i = 0; i<Seat.length;i++) {
			System.out.print(Seat[i]+" ");
		}
		System.out.println();
	}
	
	public void set(String name, int num) {//�¼� ����
		Seat[num-1]= name;
	}
	
	public boolean reset(String name) {//�¼� ���
		for(int i = 0; i<Seat.length;i++) {
			if(name.equals(Seat[i])) {
				Seat[i]="---";
				return true;
			}
		}
		return false;
	}
	
	
	
}
