package bit.edu;

public class MyUtil {

	private MyUtil(){
		//모든 멤버가 static이 붙으면 프라빗 가능쓰
		//프라빗으로 해서 하는거 소환시 더 편함 (클래스 이름뒤에다가 점찍고 소환 하니깐)
		
	}
	
	public static void Hap(int a, int b){
		System.out.println(a+b);
		
	}
	
	
	public static void Hap(float a, float b){
		System.out.println(a+b);
		
	}
}
