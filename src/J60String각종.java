
public class J60String각종 {

	public static void main(String[] args) {
		// 문자열 ?
		String s = "apple";
		
		
		// 문자열"apple"조작하기-----munja 클래스---
		// 1. 길이 구하기--------------메소드-------
		System.out.println(s.length());
		
		
		// 2. 모두 대문자로 바꾸기--------메소드-------
		System.out.println(s.toUpperCase());
		
		
		// 3. 부분문자열pp만 가져오기-------메소드------
		System.out.println(s.substring(1,3));
		
		
		// 4. p를 @로 변경-------------메소드------
		System.out.println(s.replace("p","@"));
		
		
		// 5. pl의 위치---------------메소드-----
		System.out.println(s.indexOf("pl"));
		
		
		System.out.println(s.indexOf("ppkl"));
		
		
		// java.lang.String s;
		// s=new String("apple");
		
		
		
		
		
	}

}
