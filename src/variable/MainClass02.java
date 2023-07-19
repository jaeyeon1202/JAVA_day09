package variable;

class TestClass02{
	public int test1() {
		int var = 100; //지역변수 - test1지역을 벗어날 수 없음(error)
		//메인에서 메소드 호출(생성) 후 메소드가 끝나면(소멸) 
		System.out.println("test1 var: "+var);
		
		return var; //지역을 벗어나서 변수를 사용하고 싶으면 return으로 값을 돌려준다!
	}
	public void test2(int var) {
		
		System.out.println("test2 var: "+var); //error
	}
}

public class MainClass02 {
	public static void main(String[] args) {
		
		TestClass02 t = new TestClass02();
		int v = t.test1();
		t.test2(v);

	}

}
