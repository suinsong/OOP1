import bit.edu.MovieVO;

public class J66VO�����˻� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MovieVO[] v = new MovieVO[3]; // �ڡڰ�ü �迭
		v[0] = new MovieVO("������� ���� ������", 12000, "groot", 12);
		v[1] = new MovieVO("������ ����", 15000, "�ƶ��", 10);
		v[2] = new MovieVO("�ظ�����", 6000, "�����ӽ�", 5);

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

		String title = "������� ���� ������";// ��ȭ ������ �˻��ϸ� ������ ����ϱ�
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
			System.out.println(title + "�� ������ " + v[index].getPrice());
		} else {
			System.out.println("�˻�����");

		}
	}
}