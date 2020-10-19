package EX12;

public class Seat {
	private String Seat[];
	
	public Seat() {//좌석 상태 설정
		Seat= new String[10];
		for(int i = 0; i<Seat.length;i++) {
			Seat[i]="---";
		}
	}
	
	public void show() {//좌석 상태 출력
		for(int i = 0; i<Seat.length;i++) {
			System.out.print(Seat[i]+" ");
		}
		System.out.println();
	}
	
	public void set(String name, int num) {//좌석 예약
		Seat[num-1]= name;
	}
	
	public boolean reset(String name) {//좌석 취소
		for(int i = 0; i<Seat.length;i++) {
			if(name.equals(Seat[i])) {
				Seat[i]="---";
				return true;
			}
		}
		return false;
	}
	
	
	
}
