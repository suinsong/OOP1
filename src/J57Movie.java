import bit.edu.MovieVO;

public class J57Movie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MovieVO[] v = new MovieVO[3]; // �ڡڰ�ü �迭
		v[0] = new MovieVO("������� ���� ������", 12000, "groot", 12);
		v[1] = new MovieVO("������ ����", 10000, "�ƶ��", 10);
		v[2] = new MovieVO("�ظ�����", 6000, "�����ӽ�", 5);

		// ��ȭ LEVEL�� �������� �������� �����Ͽ� ����Ͻÿ�

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