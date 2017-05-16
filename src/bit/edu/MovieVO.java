package bit.edu;
//영화-> 제목, 가격, 주인공, 제작사 등등----: ★상태정보
// 나중에는 ☆동작, 행위하는 메소드도 필요함---: DAO

public class MovieVO {
	//1. 모든 멤버변수는 정보은닉=보호
	
	private String title;
	private int price;
	private String major;
	private int level;
	
	public MovieVO(){//이 애는 기본적으로 생략되어 있음. 클래스 이름하고 똑같음
					 //이 ★디폴트 생성자 메서드에서 구조가 만들어지기 때문에 필요함 그리고 ★초기화도 시킴
				     //리턴 타입이 없음 
					 //★★그래도 이 디폴트 생성자 메서드를 명시적으로라도 만들어 놓을 것 
					 // ⓐ 객체를 생성하는 일(내부적으로 하는 일)
		  			 // ⓑ객체의 초기화(값을 넣어줌) 하는 일(직접)
					 // 다른 생성자가 있으면 이 디폴트 생성자는 사라짐
		title="가디언즈 오브 갤럭시";
		price=12000;
		major="groot";
		level=10;
		
	}
	
	
	
	
	public MovieVO(String title, int price, String major, int level) {
		this.title = title;
		this.price = price;
		this.major = major;
		this.level = level;
	}//제너럴- constructor using fields.. 이거 누르면 됨




	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	//this. 클래스를 설계할때 언젠가는 만들어질 자기 자신을 가리키는 포인터
	   	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	
		
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	
	
	
	// 한꺼번에 디버깅하려고 ★★ toString()!!!!!
	@Override
	public String toString() {
		return "MovieVO [title=" + title + ", price=" + price + ", major=" + major + ", level=" + level + "]";
	}
	
	
	
	//1. 모든 멤버변수는 정보은닉
	//2. 디폴트 생성자메서드(생략)를 명시적으로 만들것
	//3. setter, getter method
	//4. 디버깅 toString()
	

}
