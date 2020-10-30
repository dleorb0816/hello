package java1030;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex4 {

	public static void listDirectory(File dir) {
		
		System.out.println("----" + dir.getPath() + "의 서브 리스트 입니다. ---");
		
		File[] files = dir.listFiles();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		for(File file : files) {
			System.out.print(file.getName());
			System.out.print(file.isDirectory() ? "\t<DIR>":"\t" );
			System.out.print("\t파일크기: " + file.length());
			
			long mills = file.lastModified();
			Date date = new Date(mills);
			String str = sdf.format(date);
			System.out.println("\t수정한 시간 : "+ str);
		}// for
		
	}// listDirectory()
	
	public static void main(String[] args) {
		//File클래스
		File file1 = new File("C:\\Users\\admin\\Desktop\\Test\\웹프로그래밍_학습.txt");//File객체는 직접적으로 읽거나 쓰기를 못한다
		System.out.println(file1.getPath());//전체경로 출력
		System.out.println(file1.getParent());//마지막 \\ 바로 상위단계 경로까지 출력
		System.out.println(file1.getName());//실제 파일의 이름만 출력
		
		if(file1.isFile()) {
			System.out.println("파일입니다");
		}else if(file1.isDirectory()) {
			System.out.println("디렉토리입니다.");
		}
		
		File file2 = new File("C:\\Users\\admin\\Desktop\\Test\\sample");//새로만들고자 하는 디렉토리
		if(!file2.exists()) {//디렉토리 존재 검사
			file2.mkdir();	//디렉토리가 존재하지 않으면 생성
		}
		
		listDirectory(new File("C:\\Users\\admin\\Desktop\\Test"));
	}//main

}
