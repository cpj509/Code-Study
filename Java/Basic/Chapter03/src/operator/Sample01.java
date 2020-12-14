package operator;

public class Sample01 {

	public static void main(String[] args) {
		// 산술 연산자를 이용한 수학 계산
		System.out.println(5+3);
		System.out.println(5-3);
		System.out.println(5*3);
		System.out.println(5/3);
		System.out.println(5%3);
		
		// 과목 총점과 평균 구하기
		int mathScore = 90;
		int koreanScore = 85;
		
		int totalScore = mathScore + koreanScore;
		System.out.println("총점 : " + totalScore);
		
		double avgScore = (double)totalScore / 2;	// 평균
		System.out.println("평균 : " + avgScore);

	}

}
