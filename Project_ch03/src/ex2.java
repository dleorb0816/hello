
public class ex2 {

	public static void main(String[] args) {
		int n[][] = {{1},
					{1,2,3},
					{1},
					{1,2,3,4},
					{1,2}};
		for(int i = 0; i<n.length; i++) {
			System.out.println();//青积己
			for(int j = 0; j<n[i].length; j++) {
				System.out.print(n[i][j] + "   ");//凯积己	
			}
			
		}
	}
}