
public class J63Stringequals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = new String("ABC");
		String s2 = new String("ABC");

		if (s1.equals(s2)) {
			System.out.println("s1==s2");
		} else {
			System.out.println("s1!=s2");
		}
		// String s3="GRH";// ���ڿ� ���(literal)
		// int a =10;//����(���=���� �� ����)

		String s3 = "DDD";
		String s4 = "DDD"; // �̹� ������������ϱ���� ������ �ʰ� ������ ������

		if (s3.equals(s4)) {
			System.out.println("����");
		} else {
			System.out.println("�ٸ�");
		}
	}
}
