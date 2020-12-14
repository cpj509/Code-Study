package operator;

public class Sample04 {

	public static void main(String[] args) {
		// 복합 대입연산자
		int num = 10;
		System.out.println(num += 2);
		System.out.println(num %= 10);
		num--;
		System.out.println(num);
		
		int value = 5 > 3 ? 10 : 20;
		System.out.println(value);
		
		int fatherAge = 45;
		int motherAge = 47;
		
		char ch = fatherAge > motherAge ? 'T' : 'F';
		
		System.out.println(ch);
		
		

	}

}
