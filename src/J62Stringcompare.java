
public class J62Stringcompare {

	public static void main(String[] args) {
		// 문자열과 문자열을 비교

		String s1 = new String("ABC");

		String s2 = new String("DEF");

		
		//아스키 코드로 변환해서 해줌
		// A(65) B(66) C(67) :기준
		// D(68) E(69) F(70) :비교
		// ---------------------
		// -3(음수)

		// D(68) E(69) F(70) :기준
		// A(65) B(66) C(67) :비교
		// ---------------------
		// +3(양수

		// D(68) E(69) F(70)
		// D(68) E(69) F(70)
		// -------------------
		// 0 둘은 같다는 의미

		 int cmp=s1.compareTo(s2);
		 if (cmp>0) {
		 System.out.println("s1>s2");}
		 else if(cmp<0){
		 System.out.println("s1<s2");
		 }else{
		 System.out.println("s1==s2");
		 }

	}

}
