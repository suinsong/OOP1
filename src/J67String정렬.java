
public class J67String���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s="���#�ٳ���#������#����#��";
		String[] a = s.split("#");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+"\t");
		}
		
		
		System.out.println();
		System.out.println();
		
		
		String tmp;
		for (int i = 0; i < a.length-1; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i].compareTo(a[j])<0) {
					tmp=a[i];
					a[i]=a[j];
					a[j]=tmp;
				}
			}
		}for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+"\t");
		}
	}

}
