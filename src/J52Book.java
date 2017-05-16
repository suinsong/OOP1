import bit.edu.BookVO;

public class J52Book {

	public static void main(String[] args) {

		int a = 10;

		BookVO b;
		b=new BookVO();
	
		
		b.setTitle("자바");
		b.setCompany("이지스퍼블리싱");
		b.setPrice(20000);
		b.setPage(600);

		System.out.println(b);
		
	}
	}