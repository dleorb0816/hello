package test;

public class ComputerTest {

	public static void main(String[] args) {
//		computer c1 = new computer();
		computer c2 = new DeskTop();
//		computer c3 = new NoteBook();
		computer c4 = new MyNoteBook();
		
		c2.turnOn();
		c2.turnOff();
	}

}
