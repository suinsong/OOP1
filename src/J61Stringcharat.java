
public class J61Stringcharat {

	public static void main(String[] args) {
		//String ���� ���ڿ��� ����� ���� ��ü�� ����� ����
//		String s = "I am a girl";
		String s= new String("I am a girl");
		
		System.out.println(s.length());
		System.out.println(s.charAt(5));//���� �ϳ��� ������ �� ��
		System.out.println();
		
		
		for (int i = 0; i < s.length(); i++) {
			System.out.print(s.charAt(i));
		}
		
		
		System.out.println();
		
		
		String[] sp = s.split(" ");// �ڸ��� �������� �����ϱ� �迭�� ����
		for (int i = 0; i < sp.length; i++) {
			System.out.println(sp[i]);
		}
	}	

}
