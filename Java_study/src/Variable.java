import java.util.List;

public class Variable {
	public void example() {
		/*
		 * keyword : 예시
		 * 설명 
		 * */
	}
	/*
	 * keyword : 변수
	 *  쓰이는 자료형(Type)
	 * int, long, double, boolean, char, String, StringBuffer
	 * List, Map
	 * */
	public void var1() {
		int a,b,c;
		a = 1;
		b = 9;
		c = a + b;
		System.out.println("c variable : " + c);
		// 아래도 변수가 될 수 있다 
		StringBuffer sb;
		List list;
	}
	
	public void cmd() {
		/*
		 * keyword : 주석
		 * 주석은 메소드, 클래스, 일정부분에 대한 설명을 함
		 * Best comment -> Clean code that works.
		 *  
		 * */
	}
	public void type() {
		/*
		 * 자료형을 아는 건 언어의 반을 터득한 것
		 * */
		int a = 10;
		long b = 1033923412312121221L;
		float c = 3.14F;
		double d = 3.143434343434343434343;
		double d1 = 123.4;
		double d2 = 1.234e2;
		System.out.println(a +"/"+b+"/"+c+"/"+d+"/"+d1+"/"+d2);
		
	}
}
