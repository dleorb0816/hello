import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		System.out.print("양의 정수 10개를 입력하시오>> ");
		Scanner sc = new Scanner(System.in);
	
		int [] arr = new int[10];
		
		for(int i = 0; i < arr.length;i++) {
			arr[i]= sc.nextInt();
		}//배열에 값채우기
		System.out.print("3의 배수는 ");
		for(int i = 0; i<10; i++) {
			if(arr[i]%3==0) {
				System.out.print(arr[i]+" ");
			}
		}//배열에 들어가있는 값 비교한후 출력하기
	}
}