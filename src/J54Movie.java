import bit.edu.MovieVO;

public class J54Movie {//Ŭ����--->��ü--->�ν��Ͻ�(���)

	public static void main(String[] args) {

		// ��ȭ �� ���� ������ [������ ����]�Ͻÿ�.
		// ���ο� �ڷ����� ����� �𵨸��ϴ� ����= �ڡ�Ŭ�����ڡ�

		// ������ �޼���(Ŭ���� �̸��ϰ� =)
		MovieVO v;//��ü ����!!!!! �� v�� ���� v�� �ٸ�!!!!!
		
		v=new MovieVO(); // ȣ��
		//�ν��Ͻ�: ��ü���ΰ��� ������ �̰� �߿���!!!!!
		
		
		v.setMajor("groot");
		v.setLevel(3);
		v.setPrice(12000);
		v.setTitle("������� ���� ������");

		System.out.println(v.toString());

		// System.out.println(v.getLevel()+v.getMajor()); ���� �̷��� �ҷ����;� ������
		// toString �̿��ϸ� �� ŰŰ
		
	}

}
