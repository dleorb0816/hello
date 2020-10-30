package java1030;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		// 키보드 입력을 파일로 저장하기
		
		// 입력스트림 준비
		Scanner scanner = new Scanner(System.in);

		// 출력스트림 준비
		FileWriter writer = null;
		
		try {
			writer = new FileWriter("C:\\Users\\admin\\Desktop\\Test/test.txt",true);
			
			System.out.println("키보드로 문자를 입력하세요.");
			
			String line = "";
			while (true) {
				line = scanner.nextLine();	//줄바꿈 문자는 제외하고 한줄을 가져옴
				
				if(line.length()==0) {//엔터키만 입력한경우 빈문자열
					break;
					
				}
				writer.write(line + "\n");//출력스트림 객체는 기본적으로 버퍼를 가짐.
				//
			}
			writer.flush();	//바로바로 보내주는 역할 성능적으로 좋지 않음, 버퍼 비우기 해서 파일에 쓰기
							//얘를 안써줘도 된이유는 밑에서 41번째줄 close로 닫으면 내부적으로 flush()호출해서 버퍼 비우기 해줌
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			scanner.close();
			try {
				writer.close();//닫을때 버퍼에 있는 내용을 다 밀어 넣는다
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	} // main

}
