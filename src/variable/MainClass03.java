package variable;

class TestClass03{
	
	public int var=100; //인스턴스(객체) 변수 : 
	//객체가 종료되면 소멸(객체가 종료되는 순간: 메인이 끝났을때), 지역변수보다 수명이 길다.
	//일회성 변수들을(ex: for문의 int t) 인스턴스(객체) 변수로 만들면 메모리의 효율이 떨어진다.
	//일회성 변수들은 지역변수로 만들어서 사용한다!!
	//인스턴수 변수는 여러곳에서 사용한다면 인스턴스 변수로 선언한다!!
		
	public void test1() {
		var=100;
	}
	public void test2() {
		System.out.println(var);
	}
}


public class MainClass03 {

	public static void main(String[] args) {
		
		TestClass03 t = new TestClass03();
		t.test1();
		t.test2();

	}

}
