package java1030;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex1 {

	public static void main(String[] args) {
		// 자바의 IO(입출력) 데이터 종류
		
		// byte단위 처리 입출력 : 이미지파일 등의 바이너리 위주의 데이터 입출력
		//    InputStream 인터페이스 구현한 클래스
		//		-FileInputStream, BufferInputStream
		//	  OutputStream 인터페이스 구현한 클래스
		//		-FileOutputStream, BufferOutputStream
		//
		// char단위 처리 임출력 : 입출력을 char처리, 텍스트 위주의 데이터 입출력
		//		Reader인터페이스 구현한 클래스 
		//			- FileReader, InputStreamReader, BufferedReader
		//		Writer인터페이스 구현한 클래스
		//			- FileWriter, OutputStreamWriter, BufferedWriter
		
		// FileReader로 텍스트 파일 읽어서 콘솔화면에 출력하기 hwp나 doc는 안됨
		
		// 입력스트림 준비
		FileReader reader = null;
		
		try {
			reader = new FileReader("C:/Windows/system.ini");
			
			int c;
			
			while((c = reader.read()) != -1) {//파일의 끝(-1)이 아닐때 까지 문자 한개씩 읽음
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
