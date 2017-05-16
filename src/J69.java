
public class J69 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book[] b = new Book[3];

		b[0] = new Book("라라랜드", "나마에와", 25500);
		b[1] = new Book("다이죠부", "노토와", 1500);
		b[2] = new Book("가로우", "와라우", 9500);
		
		
		
		Book tmp = new Book();

		for (int i = 0; i < b.length - 1; i++) {
			for (int j = i + 1; j < b.length; j++) {
				if (b[i].getStrTitle().compareTo(b[j].getStrTitle()) > 0) {
					tmp = b[i];
					b[i] = b[j];
					b[j] = tmp;
				}
			}
		}
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}

		System.out.println();
		System.out.println();

		
		String Strtitle = "라라랜드";
		
		int low=0;
		int high =b.length;
		int middle;
		int index=-1;
		
		while (low <= high) {
			middle=(low+high)/2;

			if (Strtitle.equals(b[middle].getStrTitle())) {
				index = middle;
				break;
			} else if (Strtitle.compareTo(b[middle].getStrTitle()) > 0) {
				low = middle + 1;
			} else {
				high = middle - 1;
			}
		}
		if (index != -1) {
			System.out.println(Strtitle + "의 가격은 " + b[index].getIntPrice());
		} else {
			System.out.println("검색실패");

		}
		}
		
		

}
