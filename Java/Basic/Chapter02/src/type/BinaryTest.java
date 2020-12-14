package type;

public class BinaryTest {

	public static void main(String[] args) {
		int iNum = 10;	// decimal 10
		int bNum = 0b1010;	//	binary 10
		int hNum = 0xA;	//	hexadecimal 10
		
		System.out.println(iNum);
		System.out.println(bNum);
		System.out.println(hNum);
		
		// binary 5 and -5
		int num1 = 0b00000000000000000000000000000101;
		int num2 = 0b11111111111111111111111111111011;
		
		int sum = num1 + num2;
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(sum);
		
	}
}
