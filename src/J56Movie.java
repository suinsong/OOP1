import bit.edu.MovieVO;

public class J56Movie {

	public static void main(String[] args) {

		// ��ȭ 3���� ������ ������ �����Ͻÿ�
		MovieVO[] v = new MovieVO[3]; // �ڡڰ�ü �迭
		v[0] = new MovieVO("������� ���� ������", 12000, "groot", 12);
		v[1] = new MovieVO("������ ����", 10000, "�ƶ��", 10);
		v[2] = new MovieVO("�ظ�����", 6000, "�����ӽ�", 5);

		// for ���� ����ؼ� �� �� ����
		System.out.println(v[0].toString());
		System.out.println(v[1].toString());
		System.out.println(v[2].toString());
		System.out.println();
		for (int i = 0; i < v.length; i++) {
			System.out.println(v[i].toString());
		}

	}

}
