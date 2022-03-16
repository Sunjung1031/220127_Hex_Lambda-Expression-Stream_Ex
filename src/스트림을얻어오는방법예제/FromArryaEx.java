package 스트림을얻어오는방법예제;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.function.IntConsumer;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FromArryaEx {

	public static void main(String[] args) {
		//String[]배열객체 생성
		String[] strArray = {"인공지능","머신러닝","딥러닝","강화학습"};
		
		/*
		 * 배열로부터 스트림 얻기 => Arrays.stream(String[ ] 참조변수);
		 */
		Stream<String> strStream = Arrays.stream(strArray);
		strStream.forEach(str-> System.out.print(str+ " "));
		
		System.out.println();
		
		int[] intArray = {100,200,300,400,500};
		IntStream intStream = Arrays.stream(intArray);
		intStream.forEach(Number -> System.out.print(Number + " "));
		}

}
