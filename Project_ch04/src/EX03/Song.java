package EX03;

public class Song {
	String title;
	String artist;
	int year;
	String country;
	
	Song(){
		
	}
	
	Song(String t, String a, int y, String c){
		this.title = t;
		this.artist = a;
		this.year = y;
		this.country = c;
	}
	
	void show(){
		System.out.println(year+"�� "+country + "������ " + artist + "�� �θ� "+ title);
	}
}
