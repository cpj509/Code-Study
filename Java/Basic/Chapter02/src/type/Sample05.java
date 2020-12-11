package type;

public class Sample05 {

	public static void main(String[] args) {
		// 문자 자료형
		char ch1 = 'A';
		
		System.out.println(ch1);
		System.out.println((int)ch1);
		
		char ch2 = 66;
		System.out.println(ch2);
		System.out.println((int)ch2);
		
		//한글 처리
		char ch3 = '한';
		char ch4 = '\uD55C';
		char ch5 = '\uAE00';
		System.out.println(ch3);
		System.out.println(ch4);
		System.out.println(ch5);
		

	}

}
