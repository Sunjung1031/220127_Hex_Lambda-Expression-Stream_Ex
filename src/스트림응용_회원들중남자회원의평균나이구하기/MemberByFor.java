package ��Ʈ������_ȸ�����߳���ȸ������ճ��̱��ϱ�;

public class MemberByFor {

	public static void main(String[] args) {
		String[][] str = { { "�����", "Male", "30" }, 
						   { "�̰���", "Male", "26" }, 
						   { "�迬��", "Female", "32" },
						   { "������", "Female", "28" }, 
						   { "����ȫ", "Male", "35" } };
		double avg;
		double sum = 0;
		int i;
		int count = 0;
		for (i = 0; i < str.length; i++) {
			if (str[i][1] == "Male") {

				int arr = (int) Integer.parseInt(str[i][2]);
				count = count + 1;
				sum = sum + arr;
				avg = sum / count;

				System.out.println(avg);

			}
		}

	}

}
