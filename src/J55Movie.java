import bit.edu.MovieVO;

public class J55Movie {

	public static void main(String[] args) {
		// ��ȭ 1���� �����ϱ� ���� ��ü���� = �ν��Ͻ� ����
		// 3���� �ʱ�ȭ ����� ����

		MovieVO v = new MovieVO();
		System.out.println(v);

		MovieVO v1 = new MovieVO("������ ����", 10000, "�ƶ��", 5);
		System.out.println(v1);

		MovieVO v2 = new MovieVO();
		v2.setTitle("�ظ�����");
		v2.setPrice(5000);
		v2.setMajor("�����ӽ�");
		v2.setLevel(2);
		System.out.println(v2);
	}

}
