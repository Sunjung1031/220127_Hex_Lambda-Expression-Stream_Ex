package 스트림응용_회원들중남자회원의평균나이구하기;

public class MemberByFor {

	public static void main(String[] args) {
		String[][] str = { { "손흥민", "Male", "30" }, 
						   { "이강인", "Male", "26" }, 
						   { "김연아", "Female", "32" },
						   { "김은진", "Female", "28" }, 
						   { "안재홍", "Male", "35" } };
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
