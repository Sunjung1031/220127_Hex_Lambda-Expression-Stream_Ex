package ��Ʈ���������¹������;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.function.IntConsumer;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FromArryaEx {

	public static void main(String[] args) {
		//String[]�迭��ü ����
		String[] strArray = {"�ΰ�����","�ӽŷ���","������","��ȭ�н�"};
		
		/*
		 * �迭�κ��� ��Ʈ�� ��� => Arrays.stream(String[ ] ��������);
		 */
		Stream<String> strStream = Arrays.stream(strArray);
		strStream.forEach(str-> System.out.print(str+ " "));
		
		System.out.println();
		
		int[] intArray = {100,200,300,400,500};
		IntStream intStream = Arrays.stream(intArray);
		intStream.forEach(Number -> System.out.print(Number + " "));
		}

}
