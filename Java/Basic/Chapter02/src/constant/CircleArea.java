package constant;

public class CircleArea {

	public static void main(String[] args) {
		// calculate area of circle: PI * r * r
		final double PI = 3.14;
		int radius = 5;
		double area;
		
		area = PI * radius * radius;
		System.out.println("Circle Area : " + area);
		//file name(class name) -> packagename.filename
		CircleArea circle = new CircleArea();
		System.out.println(circle);	// constant.CircleArea@3fb4f649


	}

}
