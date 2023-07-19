package this_;

class TestClass02{
	private int num ; //정보은닉(은닉화)
	private int n=500;
	public void test(int n) {//내부에 있는 메소드를 통해서 데이터를 저장한다.
		num=n; 
	}//해당하는 변수를 설정하는 메소드 
	
	public int test2() {
		return num;
	}//설정한 데이터를 돌려주는 메소드
	
}

public class MainClass02 {
	public static void main(String[] args) {
		TestClass02 t = new TestClass02();
		int n =12345;
		t.test(n);
		int re =t.test2();
		System.out.println(re);
		
	}

}
