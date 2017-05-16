
public class J64String배열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] s = new String[3];
		s[0] = "사과";
		s[1] = "바나나";
		s[2] = "포도";

		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);// toString이 기본적으로 들어가있음
		}
		
		String str = new String("apple");
		System.out.println(str.toString());// 그냥 str치면 원래는 번지가 나와야하는데 toString이
											// 기본적으로 들어가있음

		String[] f = { "사과", "바나나", "오렌지", "귤" };

		for (int i = 0; i < f.length; i++) {
			System.out.print(f[i]);
		}

		System.out.println();
		String[] ap = { "apple", "orange", "grape", "banana" };
		for (int i = 0; i < ap.length; i++) {
			System.out.println(ap[i].toUpperCase());
		}
		
		
		
		
		

	}

}
