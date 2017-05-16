import bit.edu.MovieVO;

public class J54Movie {//클래스--->객체--->인스턴스(사용)

	public static void main(String[] args) {

		// 영화 한 편을 저장할 [변수를 선언]하시오.
		// 새로운 자료형을 설계와 모델링하는 도구= ★★클래스★★

		// 생성자 메서드(클래스 이름하고 =)
		MovieVO v;//객체 변수!!!!! 이 v랑 밑의 v는 다름!!!!!
		
		v=new MovieVO(); // 호출
		//인스턴스: 구체적인값이 있으면 이게 중요해!!!!!
		
		
		v.setMajor("groot");
		v.setLevel(3);
		v.setPrice(12000);
		v.setTitle("가디언즈 오브 갤러시");

		System.out.println(v.toString());

		// System.out.println(v.getLevel()+v.getMajor()); 원래 이렇게 불러내와야 하지만
		// toString 이용하면 됨 키키
		
	}

}
