package type;

public class Sample02 {

	public static void main(String[] args) {
		// Type Conversion
		// 묵시적 형변환(큰 자료형 = 작은 자료형)
		byte bNum = 10;
		int iNum = bNum;
		
		System.out.println(bNum);// 10
		System.out.println(iNum);// 10
		
		int iNum2 = 20;
		float fNum = iNum2;
		
		System.out.println(iNum2);// 20
		System.out.println(fNum);// 20.0
		
		double dNum;
		dNum = fNum + iNum;
		System.out.println(dNum);// 30.0

	}

}
