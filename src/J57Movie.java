import bit.edu.MovieVO;

public class J57Movie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MovieVO[] v = new MovieVO[3]; // ★★객체 배열
		v[0] = new MovieVO("가디언즈 오브 갤럭시", 12000, "groot", 12);
		v[1] = new MovieVO("반지의 제왕", 10000, "아라곤", 10);
		v[2] = new MovieVO("해리포터", 6000, "엠마왓슨", 5);

		// 영화 LEVEL을 기준으로 오름차순 정렬하여 출력하시오

		MovieVO tmp;
		for (int i = 0; i < v.length-1; i++) {
			for (int j = i + 1; j < v.length; j++) {
				if (v[i].getLevel() > v[i].getLevel()) {
					tmp = v[i];
					v[i] = v[j];
					v[j] = tmp;
				}
			}
		}
		for (int i = 0; i < v.length; i++) {
			System.out.println(v[i]);
		}
/*
		int[] a = { 7, 4, 8, 6, 3, 1 };
		int tmp;
		for (int i = 0; i < a.length; i++) {
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
	}
*/
}
}