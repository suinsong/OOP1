import bit.edu.MovieVO;

public class J66VO이진검색 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MovieVO[] v = new MovieVO[3]; // ★★객체 배열
		v[0] = new MovieVO("가디언즈 오브 갤럭시", 12000, "groot", 12);
		v[1] = new MovieVO("반지의 제왕", 15000, "아라곤", 10);
		v[2] = new MovieVO("해리포터", 6000, "엠마왓슨", 5);

		MovieVO tmp = new MovieVO();

		for (int i = 0; i < v.length - 1; i++) {
			for (int j = i + 1; j < v.length; j++) {
				if (v[i].getTitle().compareTo(v[j].getTitle()) > 0) {
					tmp = v[i];
					v[i] = v[j];
					v[j] = tmp;
				}
			}
		}
		for (int i = 0; i < v.length; i++) {
			System.out.println(v[i]);
		}

		System.out.println();
		System.out.println();

		String title = "가디언즈 오브 갤럭시";// 영화 제목을 검색하면 가격을 출력하기
		int low = 0;
		int high = v.length;
		int middle;
		int index = -1;

		while (low <= high) {
			middle = (low + high) / 2;
			if (title.equals(v[middle].getTitle())) {
				index = middle;
				break;
			} else if (title.compareTo(v[middle].getTitle()) > 0) {
				low = middle + 1;
			} else {
				high = middle - 1;
			}
		}
		if (index != -1) {
			System.out.println(title + "의 가격은 " + v[index].getPrice());
		} else {
			System.out.println("검색실패");

		}
	}
}