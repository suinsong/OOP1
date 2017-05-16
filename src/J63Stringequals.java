
public class J63Stringequals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = new String("ABC");
		String s2 = new String("ABC");

		if (s1.equals(s2)) {
			System.out.println("s1==s2");
		} else {
			System.out.println("s1!=s2");
		}
		// String s3="GRH";// 문자열 상수(literal)
		// int a =10;//정수(상수=변할 수 없음)

		String s3 = "DDD";
		String s4 = "DDD"; // 이미 만들어져있으니깐따로 만들진 않고 번지를 공유함

		if (s3.equals(s4)) {
			System.out.println("같음");
		} else {
			System.out.println("다름");
		}
	}
}
