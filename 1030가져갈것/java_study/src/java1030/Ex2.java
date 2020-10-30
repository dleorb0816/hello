package java1030;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex2 {

	public static void main(String[] args) {
		// InputStreamReader�� �ѱ� �ؽ�Ʈ ���� �б�
		
		InputStreamReader reader = null;//��ǲ��Ʈ������ �غ�(���� ������ ������ �о�´�)
		FileInputStream fis = null;	//���� ��ǲ ��Ʈ�� �غ�(������ �����)
		
		try {
			fis = new FileInputStream("C:\\Users\\admin\\Desktop\\Test/�����α׷���_�н�.txt");
			reader = new InputStreamReader(fis, "utf-8");
			
			int c;
			
			while ((c = reader.read()) != -1) {
				System.out.print((char)c);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				reader.close(); //���������� ����� ����� ��ü�� �ݾ��ָ�
								// �� �ȿ� �����ִ� ����� ��ü�� �ڵ����� ����
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	} // main
}
