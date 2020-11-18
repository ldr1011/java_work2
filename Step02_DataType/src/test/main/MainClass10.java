package test.main;

public class MainClass10 {
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작 되었습니다.");
		//기본 데이터 type
		int num1=10;
		double num2=10.1;
		char ch1='a';
		//참조 데이터 type 값이 아니라 참조값이 들어있음
		String str="abcde12345";
		// length() 메소드는 문자열의 길이를 리턴한다.
		int size=str.length();
		char ch=str.charAt(5);
		//소문자를 모두 대문자로 변환한 문자열 얻어내기
		String result=str.toUpperCase();
		boolean a= (str==result);
	}
}
