package ��Ʈ������_ȸ�����߳���ȸ������ճ��̱��ϱ�;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MemberTest {

	public static void main(String[] args) {
		List<Member>list = Arrays.asList(new Member("�����",Member.MALE,30),
										 new Member("�̰���",Member.MALE,26),
										 new Member("�迬��",Member.FEMALE,32),
										 new Member("������",Member.FEMALE,28),
			
										 new Member("����ȫ",Member.MALE,35));
		/*
		 * ������������ �ڹ� �ڵ�� ǥ���ϸ� ������ ����.
		 * ��Ʈ���� Ư¡�� ��ȸ���̴�.
		 * ��Ʈ���� �ѹ� ����ϸ� �ٽ� ����� �� ����.
		 * �ʿ��ϴٸ� ��Ʈ���� �ٽ� �����ؾ� �Ѵ�.
		 */
		
		/*
		Stream<Member>maleFemaleStream = list.stream(); //�������� ��Ʈ�� 
		Stream<Member>maleStream = maleFemaleStream.filter(m-> m.getGender()== Member.MALE);
		IntStream ageStream = maleStream.mapToInt(Member::getAge);
		OptionalDouble optionalDouble = ageStream.average();
		double ageAvg = optionalDouble.getAsDouble();
		*/
		//���ú����� �����ϰ� �����ϸ� ������ ���� ������ ������ ���� �ڵ常 ���´�. 
		
		
		  double ageAvg = list.stream()
							.filter(m-> m.getGender()== Member.MALE)
							.mapToInt(Member::getAge)  //::�� '�޼ҵ� ����'�� �ǹ��Ѵ�.
							.average()
							.getAsDouble();
		
		  //������ �ڵ� ������� �ذ� => for��, if���� �����Ͽ� 
		  
		/*
		  int count = 0;
		  double sum = 0;
		  
		  for (int i=0; i<list.size(); i++) {
			  if(list.get(i).getGender()==Member.MALE) {
				  sum += list.get(i).getAge();
				  count++;
	
			  }
		  }
		  double ageAvg = sum/count;
		  */
			    System.out.println("����ȸ���� ��ճ���: "+ ageAvg); //����ȸ���� ��ճ���30.333333333333332
				System.out.format("����ȸ���� ��ճ���: " +"%.2f",ageAvg);//����ȸ���� ��ճ���: 30.33

	}

}
