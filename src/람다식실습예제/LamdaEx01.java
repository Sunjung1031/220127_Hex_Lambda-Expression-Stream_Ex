package ���ٽĽǽ�����;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

/*
 * �̹� ������ ���ٽİ� ��Ʈ���� ���Ե� ����
 */

public class LamdaEx01 {

	public static void main(String[] args) {
		//(1) ���� ������� ���� �ذ� 
		/*
		List<Integer>list = (List)Arrays.asList(10,20,30,40,50);
		
		//Iterator�� �ܺ� �ݺ����̴�.  
		Iterator<Integer>iterator = list.iterator();
		
		while(iterator.hasNext()) {
			Integer value = iterator.next();
			System.out.println(value);
		}
		*/
		//(2) ���ٽİ� ��Ʈ���� �����Ͽ� ���� �ذ�
		List<Integer>list = (List)Arrays.asList(10,20,30,40,50);
		
		//Stream ���� �ݺ��� ����
		//[�߿�] �÷������κ��� ��Ʈ�� ���
		Stream<Integer> stream = list.stream();
		
		stream.forEach(value->System.out.println(value));

	}

}
