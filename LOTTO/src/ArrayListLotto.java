import java.util.*;

public class ArrayListLotto extends ArrayList<Integer> {

	public ArrayListLotto(){
		super(6);
	}
	
	public void randomAdd() {
		int cnt =0;
		while(cnt<6) {
			Integer ran = new Integer((int) (Math.random()*45+1));
			if(!contains(ran)) {
				add(ran);
				cnt++;
			}
		}
	}
	
	public void lottoPrint() {
		//System.out.print("´çÃ· ¹øÈ£´Â :\t");
		for(Integer ran :this) {
			System.out.print(ran+" ");
		}
		System.out.println();
	}
}
