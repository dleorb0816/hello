package java0922;

import java.util.HashSet;
import java.util.Set;

public class Ex2 {

	public static void main(String[] args) {
		//컬렉션 : 자료구조 데이터 저장공간 객체만 저장 가능(기본자료형 데이터는 저장 불가능)
		
		//Set(집합)	: 순서가 없는 자료 구조. 중복값 혀용 안함.
		//List(목록) : 순서가 있는 자료 구조. 가변크기 배열.중복값 혀용 함.
		//Map(매핑) : 순서는 없고 (키,값) 쌍의 자료구조. 키는 중복불가능 -> 키가 Set으로 구성됨.
		
		Set<Integer> set = new HashSet<>();
		set.add(10);
		set.add(20);
		set.add(10);
		
		System.out.println(set.size());
		
		System.out.println(set);//set.toString()호출함
		
		Set<String> strSet = new HashSet<>();
		strSet.add("홍길동");
		strSet.add("성춘향");
		strSet.add("이몽룡");
		strSet.add("신사임당");
		
		//for -each문
		for( String name : strSet ) {//strSet에 저장된 내용을 String 변수 name에 저장하는걸 반복함
			System.out.println(name);
		}
		
		Set<Object> set2 = new HashSet();
		set2.add(10); //int형 -> Integer형 객체로 변환되서 저장됨
		set2.add("문자열");
		set2.add(new Puppy());
		
		for(Object obj :set2 ) {
			System.out.println(obj);
		}
		
	}

}
