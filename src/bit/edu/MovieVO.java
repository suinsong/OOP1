package bit.edu;
//��ȭ-> ����, ����, ���ΰ�, ���ۻ� ���----: �ڻ�������
// ���߿��� �ٵ���, �����ϴ� �޼ҵ嵵 �ʿ���---: DAO

public class MovieVO {
	//1. ��� ��������� ��������=��ȣ
	
	private String title;
	private int price;
	private String major;
	private int level;
	
	public MovieVO(){//�� �ִ� �⺻������ �����Ǿ� ����. Ŭ���� �̸��ϰ� �Ȱ���
					 //�� �ڵ���Ʈ ������ �޼��忡�� ������ ��������� ������ �ʿ��� �׸��� ���ʱ�ȭ�� ��Ŵ
				     //���� Ÿ���� ���� 
					 //�ڡڱ׷��� �� ����Ʈ ������ �޼��带 ��������ζ� ����� ���� �� 
					 // �� ��ü�� �����ϴ� ��(���������� �ϴ� ��)
		  			 // �ΰ�ü�� �ʱ�ȭ(���� �־���) �ϴ� ��(����)
					 // �ٸ� �����ڰ� ������ �� ����Ʈ �����ڴ� �����
		title="������� ���� ������";
		price=12000;
		major="groot";
		level=10;
		
	}
	
	
	
	
	public MovieVO(String title, int price, String major, int level) {
		this.title = title;
		this.price = price;
		this.major = major;
		this.level = level;
	}//���ʷ�- constructor using fields.. �̰� ������ ��




	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	//this. Ŭ������ �����Ҷ� �������� ������� �ڱ� �ڽ��� ����Ű�� ������
	   	
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
	
	
	
	// �Ѳ����� ������Ϸ��� �ڡ� toString()!!!!!
	@Override
	public String toString() {
		return "MovieVO [title=" + title + ", price=" + price + ", major=" + major + ", level=" + level + "]";
	}
	
	
	
	//1. ��� ��������� ��������
	//2. ����Ʈ �����ڸ޼���(����)�� ��������� �����
	//3. setter, getter method
	//4. ����� toString()
	

}
