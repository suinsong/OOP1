import bit.edu.MovieVO;

public class J56Movie {

	public static void main(String[] args) {

		// 영화 3편을 저장할 변수를 선언하시오
		MovieVO[] v = new MovieVO[3]; // ★★객체 배열
		v[0] = new MovieVO("가디언즈 오브 갤럭시", 12000, "groot", 12);
		v[1] = new MovieVO("반지의 제왕", 10000, "아라곤", 10);
		v[2] = new MovieVO("해리포터", 6000, "엠마왓슨", 5);

		// for 구문 사용해서 할 수 있음
		System.out.println(v[0].toString());
		System.out.println(v[1].toString());
		System.out.println(v[2].toString());
		System.out.println();
		for (int i = 0; i < v.length; i++) {
			System.out.println(v[i].toString());
		}

	}

}
