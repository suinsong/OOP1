import bit.edu.MovieVO;

public class J58Movie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MovieVO[] v = new MovieVO[3]; // �ڡڰ�ü �迭
		v[0] = new MovieVO("������� ���� ������", 12000, "groot", 12);
		v[1] = new MovieVO("������ ����", 15000, "�ƶ��", 10);
		v[2] = new MovieVO("�ظ�����", 6000, "�����ӽ�", 5);

		
		
		ascMovie(v);
		for (int i = 0; i < v.length; i++) {
			System.out.println(v[i]);
		}
	}
	
	
//�Ű������� ��ȭ ���� ���� �޾Ƽ� ������ �������� �������� �����ϴ� �޼��带 ����(ascMovie) 
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
