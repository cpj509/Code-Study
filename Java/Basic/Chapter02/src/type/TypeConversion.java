package type;

public class TypeConversion {

	public static void main(String[] args) {
		// 명시적 형변환
		double dNum = 1.2;
		float fNum = 0.9F;
		
		int iNum = (int)dNum + (int)fNum;	// 1 + 0
		System.out.println(iNum);
				
		int iNum2 = (int) (dNum + fNum);	// 2
		System.out.println(iNum2);
	}
}