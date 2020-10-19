package java0922;

import java.util.ArrayList;
import java.util.List;

public class Ex3 {

	public static void main(String[] args) {
		//List : 가변크기 배열
		
		//마지막에 요소 추가
		List<Integer> numList = new ArrayList<>();
		numList.add(100);	//인덱스 0번째
		numList.add(200);	//인덱스 1번째
		numList.add(100);	//인덱스 2번째
		
		//특정위치에 요소 삽임
		numList.add(1, 400); //인덱스 1번째 위치에 400값 삽입
		
		System.out.println(numList.toString());
		
		for( int i=0; i<numList.size();i++) {
			int num = numList.get(i);
			System.out.println("num=" + num);
		}
		
		System.out.println("++==========================");
		
		//Integer -> int:언박싱
		//int -> Integer : 박싱
		
		
		//for each문사용(제네릭타입이라 사용가능)
		for(int num :numList ) {
			System.out.println("num = " + num);
		}
		
		
		numList.set(0, 1000); // 인덱스 0번째 요소를 1000으로 수정
		
		numList.remove(2);//인덱스 2번째 요소 삭제
		
		numList.clear();
	}//main

}
