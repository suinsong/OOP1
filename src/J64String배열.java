
public class J64String�迭 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] s = new String[3];
		s[0] = "���";
		s[1] = "�ٳ���";
		s[2] = "����";

		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);// toString�� �⺻������ ������
		}
		
		String str = new String("apple");
		System.out.println(str.toString());// �׳� strġ�� ������ ������ ���;��ϴµ� toString��
											// �⺻������ ������

		String[] f = { "���", "�ٳ���", "������", "��" };

		for (int i = 0; i < f.length; i++) {
			System.out.print(f[i]);
		}

		System.out.println();
		String[] ap = { "apple", "orange", "grape", "banana" };
		for (int i = 0; i < ap.length; i++) {
			System.out.println(ap[i].toUpperCase());
		}
		
		
		
		
		

	}

}
