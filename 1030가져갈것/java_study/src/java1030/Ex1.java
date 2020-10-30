package java1030;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex1 {

	public static void main(String[] args) {
		// �ڹ��� IO(�����) ������ ����
		
		// byte���� ó�� ����� : �̹������� ���� ���̳ʸ� ������ ������ �����
		//    InputStream �������̽� ������ Ŭ����
		//		-FileInputStream, BufferInputStream
		//	  OutputStream �������̽� ������ Ŭ����
		//		-FileOutputStream, BufferOutputStream
		//
		// char���� ó�� ����� : ������� charó��, �ؽ�Ʈ ������ ������ �����
		//		Reader�������̽� ������ Ŭ���� 
		//			- FileReader, InputStreamReader, BufferedReader
		//		Writer�������̽� ������ Ŭ����
		//			- FileWriter, OutputStreamWriter, BufferedWriter
		
		// FileReader�� �ؽ�Ʈ ���� �о �ܼ�ȭ�鿡 ����ϱ� hwp�� doc�� �ȵ�
		
		// �Է½�Ʈ�� �غ�
		FileReader reader = null;
		
		try {
			reader = new FileReader("C:/Windows/system.ini");
			
			int c;
			
			while((c = reader.read()) != -1) {//������ ��(-1)�� �ƴҶ� ���� ���� �Ѱ��� ����
				System.out.print((char)c);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		

	}

}
