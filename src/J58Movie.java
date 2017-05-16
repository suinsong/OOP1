import bit.edu.MovieVO;

public class J58Movie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MovieVO[] v = new MovieVO[3]; // ★★객체 배열
		v[0] = new MovieVO("가디언즈 오브 갤럭시", 12000, "groot", 12);
		v[1] = new MovieVO("반지의 제왕", 15000, "아라곤", 10);
		v[2] = new MovieVO("해리포터", 6000, "엠마왓슨", 5);

		
		
		ascMovie(v);
		for (int i = 0; i < v.length; i++) {
			System.out.println(v[i]);
		}
	}
	
	
//매개변수로 영화 여러 편을 받아서 가격을 기준으로 오름차순 정렬하는 메서드를 정의(ascMovie) 
	public static void ascMovie(MovieVO[] v) {
		MovieVO tmp;
		for (int i = 0; i < v.length-1; i++) {
			for (int j = i+1; j < v.length; j++) {
				if (v[i].getPrice()>v[j].getPrice()) {
					tmp=v[i];
					v[i]=v[j];
					v[j]=tmp;
				}
			}
		}
		System.out.println();
//		return;
	}

}
