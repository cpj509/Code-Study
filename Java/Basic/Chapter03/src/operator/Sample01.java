package operator;

public class Sample01 {

	public static void main(String[] args) {
		// ��� �����ڸ� �̿��� ���� ���
		System.out.println(5+3);
		System.out.println(5-3);
		System.out.println(5*3);
		System.out.println(5/3);
		System.out.println(5%3);
		
		// ���� ������ ��� ���ϱ�
		int mathScore = 90;
		int koreanScore = 85;
		
		int totalScore = mathScore + koreanScore;
		System.out.println("���� : " + totalScore);
		
		double avgScore = (double)totalScore / 2;	// ���
		System.out.println("��� : " + avgScore);

	}

}
