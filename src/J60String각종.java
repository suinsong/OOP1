
public class J60String���� {

	public static void main(String[] args) {
		// ���ڿ� ?
		String s = "apple";
		
		
		// ���ڿ�"apple"�����ϱ�-----munja Ŭ����---
		// 1. ���� ���ϱ�--------------�޼ҵ�-------
		System.out.println(s.length());
		
		
		// 2. ��� �빮�ڷ� �ٲٱ�--------�޼ҵ�-------
		System.out.println(s.toUpperCase());
		
		
		// 3. �κй��ڿ�pp�� ��������-------�޼ҵ�------
		System.out.println(s.substring(1,3));
		
		
		// 4. p�� @�� ����-------------�޼ҵ�------
		System.out.println(s.replace("p","@"));
		
		
		// 5. pl�� ��ġ---------------�޼ҵ�-----
		System.out.println(s.indexOf("pl"));
		
		
		System.out.println(s.indexOf("ppkl"));
		
		
		// java.lang.String s;
		// s=new String("apple");
		
		
		
		
		
	}

}
