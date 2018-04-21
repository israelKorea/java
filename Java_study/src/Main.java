
public class Main {

	public static void main(String[] args) {
		// 2018.4.22 at midnight
		/*
		 * public : 접근제어자
		 * static : 메소드 static 선언시, 인스턴스 생성없이 실행 가능
		 * void : 리턴값이 없음
		 * Sysout : 표준출력으로 데이터를 보내는 자바의 내장 메소드
		 * public, static 등은 인스턴스, 객체 등을 알고 짚어야 한다
		 * */
		System.out.println("hello world!");
		
		Variable var = new Variable();
		var.var1();
	}
}
