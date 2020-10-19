import java.util.Scanner;

public class ex10 {

	public static void main(String[] args) {
		
		 int[][] arr = new int[4][4]; // 4열 4행의 새로운 int 배열
		  for(int c = 0; c< 10;){ // c가 9보다 작을때까지 반복 정수자리
		   int i = (int)(Math.random()*4); // 0~3까지의 난수 발생
		   int j = (int)(Math.random()*4);
		   if(arr[i][j] == 0){ // 랜덤하게 0~3까지의 난수 배열이 0과 같다면
		    c++; // c를 1증가시키고
		    arr[i][j] = (int)(Math.random() * 10 +1); // 해당배열에 1~9까지의 난수를 저장
		   }
		  }
		  //배열 전체 출력
		  for(int i = 0; i<arr.length; i++){
		   for(int j = 0; j<arr[i].length; j++)
		    System.out.print(arr[i][j]+" ");
		   System.out.println("");
		  }
	}
}
