package type;

public class Sample03 {

	public static void main(String[] args) {
		// �ڷ����� ũ�� - ���� ����
		// byte = 8bit
		byte bData1 = -128;
		byte bData2 = (byte)128;
		System.out.println(bData1);
		System.out.println(bData2);
		
		// short = 2byte = 16bit
		short sData1 = 32767;
//		short sData2 = 32768;
		System.out.println(sData1);
		
		int iData1 = 1234567890;
		System.out.println(iData1);
		
		// long���� ���� �빮�ڳ� �ҹ��� L�� ����(int�� �����ϱ����ؼ�)
		long lData1 = 12345678900L;
		System.out.println(lData1);
		
		

	}

}
