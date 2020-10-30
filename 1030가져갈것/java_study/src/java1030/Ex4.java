package java1030;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex4 {

	public static void listDirectory(File dir) {
		
		System.out.println("----" + dir.getPath() + "�� ���� ����Ʈ �Դϴ�. ---");
		
		File[] files = dir.listFiles();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		for(File file : files) {
			System.out.print(file.getName());
			System.out.print(file.isDirectory() ? "\t<DIR>":"\t" );
			System.out.print("\t����ũ��: " + file.length());
			
			long mills = file.lastModified();
			Date date = new Date(mills);
			String str = sdf.format(date);
			System.out.println("\t������ �ð� : "+ str);
		}// for
		
	}// listDirectory()
	
	public static void main(String[] args) {
		//FileŬ����
		File file1 = new File("C:\\Users\\admin\\Desktop\\Test\\�����α׷���_�н�.txt");//File��ü�� ���������� �аų� ���⸦ ���Ѵ�
		System.out.println(file1.getPath());//��ü��� ���
		System.out.println(file1.getParent());//������ \\ �ٷ� �����ܰ� ��α��� ���
		System.out.println(file1.getName());//���� ������ �̸��� ���
		
		if(file1.isFile()) {
			System.out.println("�����Դϴ�");
		}else if(file1.isDirectory()) {
			System.out.println("���丮�Դϴ�.");
		}
		
		File file2 = new File("C:\\Users\\admin\\Desktop\\Test\\sample");//���θ������ �ϴ� ���丮
		if(!file2.exists()) {//���丮 ���� �˻�
			file2.mkdir();	//���丮�� �������� ������ ����
		}
		
		listDirectory(new File("C:\\Users\\admin\\Desktop\\Test"));
	}//main

}
