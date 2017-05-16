import bit.edu.MovieVO;

public class J55Movie {

	public static void main(String[] args) {
		// 영화 1편을 저장하기 위한 객체생성 = 인스턴스 생성
		// 3가지 초기화 방법이 잇음

		MovieVO v = new MovieVO();
		System.out.println(v);

		MovieVO v1 = new MovieVO("반지의 제왕", 10000, "아라곤", 5);
		System.out.println(v1);

		MovieVO v2 = new MovieVO();
		v2.setTitle("해리포터");
		v2.setPrice(5000);
		v2.setMajor("엠마왓슨");
		v2.setLevel(2);
		System.out.println(v2);
	}

}
