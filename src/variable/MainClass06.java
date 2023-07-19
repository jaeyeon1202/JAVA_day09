package variable;

class TestClass06{
	public static int su;
	public void test() {
		su=100;
	}
	/*
	public int su;
	public static void test(){
		su=100;
	}
	=>error가 뜨는 이유: 
	static은 1번줄부터 코드를 읽고 내려올때, static을 만나면 저장소에 먼저 저장한다.
	test메소드는 이미 저장소에 저장이 되었는데 ,int su는 객체를 생성해야 만들어지는 변수이기 때문에 아직 생성되지 않아서
	error이 발생하는 것이다.
	 */
	
}

public class MainClass06 {
	
	public static int num;
	public static void test() {
		
	}
	// 메인이 있는 클래스에 변수나 메소드를 만들면 static으로 만들어야 error가 발생하지 않는다
	
	public static void main(String[] args) {
		

	}

}
