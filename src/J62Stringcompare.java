
public class J62Stringcompare {

	public static void main(String[] args) {
		// ���ڿ��� ���ڿ��� ��

		String s1 = new String("ABC");

		String s2 = new String("DEF");

		
		//�ƽ�Ű �ڵ�� ��ȯ�ؼ� ����
		// A(65) B(66) C(67) :����
		// D(68) E(69) F(70) :��
		// ---------------------
		// -3(����)

		// D(68) E(69) F(70) :����
		// A(65) B(66) C(67) :��
		// ---------------------
		// +3(���

		// D(68) E(69) F(70)
		// D(68) E(69) F(70)
		// -------------------
		// 0 ���� ���ٴ� �ǹ�

		 int cmp=s1.compareTo(s2);
		 if (cmp>0) {
		 System.out.println("s1>s2");}
		 else if(cmp<0){
		 System.out.println("s1<s2");
		 }else{
		 System.out.println("s1==s2");
		 }

	}

}
