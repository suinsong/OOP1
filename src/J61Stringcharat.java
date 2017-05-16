
public class J61Stringcharat {

	public static void main(String[] args) {
		//String 에서 문자열을 만드는 것은 객체를 만드는 것임
//		String s = "I am a girl";
		String s= new String("I am a girl");
		
		System.out.println(s.length());
		System.out.println(s.charAt(5));//글자 하나만 가지고 올 때
		System.out.println();
		
		
		for (int i = 0; i < s.length(); i++) {
			System.out.print(s.charAt(i));
		}
		
		
		System.out.println();
		
		
		String[] sp = s.split(" ");// 자르면 여러개가 나오니깐 배열로 받음
		for (int i = 0; i < sp.length; i++) {
			System.out.println(sp[i]);
		}
	}	

}
