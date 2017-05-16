
public class J65String정렬sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 5, 2, 3, 1, 4 };

		int tmp;
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					tmp = a[i];
					a[i] = a[j];
					a[j] = tmp;
				}
			}
		}

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");

		}

		System.out.println();
		System.out.println();

		String tmp1 = "";
		String[] s = { "사과", "바나나", "오렌지", "포도", "귤" };
		for (int i = 0; i < s.length - 1; i++) {
			for (int j = i + 1; j < s.length; j++) {
				if (s[i].compareTo(s[j]) > 0) {
					tmp1 = s[i];
					s[i] = s[j];
					s[j] = tmp1;

				}
			}
		}
		for (int i = 0; i < s.length; i++) {
			System.out.print(s[i] + "\t");
		}

	}

}
