package bit.edu;
//책--> 제목, 가격, 출판사, 지은이, 페이지 수, ISBN..상태정보들이 들어있음
public class BookVO {
	//1. 멤버변수(상태정보) 는 모두 프라빗으로 만들어야 함
	
	private String title;
	private int price;
	private String company;
	private int page;
	
		
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}


	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}


	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}


	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}





	@Override
	public String toString() {
		return "BookVO [title=" + title + ", price=" + price + ", company=" + company + ", page=" + page + "]";
	}
	
}
	

	

	

