import java.util.Scanner;

public class ex10 {

	public static void main(String[] args) {
		
		 int[][] arr = new int[4][4]; // 4�� 4���� ���ο� int �迭
		  for(int c = 0; c< 10;){ // c�� 9���� ���������� �ݺ� �����ڸ�
		   int i = (int)(Math.random()*4); // 0~3������ ���� �߻�
		   int j = (int)(Math.random()*4);
		   if(arr[i][j] == 0){ // �����ϰ� 0~3������ ���� �迭�� 0�� ���ٸ�
		    c++; // c�� 1������Ű��
		    arr[i][j] = (int)(Math.random() * 10 +1); // �ش�迭�� 1~9������ ������ ����
		   }
		  }
		  //�迭 ��ü ���
		  for(int i = 0; i<arr.length; i++){
		   for(int j = 0; j<arr[i].length; j++)
		    System.out.print(arr[i][j]+" ");
		   System.out.println("");
		  }
	}
}
