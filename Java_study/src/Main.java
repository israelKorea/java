
public class Main {

	/*
	 * main메소드는 프로그램 실행시 파라미터를 입력받을 수 있음
	 * >> String[] args 통해서 저장됨
	 * String : 문자열을 나타내는 자바의 자료형
	 * args[] : String자료형에 대한 변수명으로 args뒤에 []가 있어서 배열임
	 * 
	 * ex. C:\> java Test a b c
	 * 실행 시, 입력값 순서대로 a b c가 저장된다
	 * */
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
		var.type();
	}
}
