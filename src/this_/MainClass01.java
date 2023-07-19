package this_;

class TestClass01{
	public int num=12345; //==this.num
	public void test() {
		int num = 789789;
		System.out.println("this: "+this);//t의 값이나 this값이 동일하다 //동일한 방법으로 사용할 수 있다.
		System.out.println("this: "+this.num);
		System.out.println(num);
	}
}
public class MainClass01 {

	public static void main(String[] args) {
		/*
		 this
		 - 메소드의 0번째 매개변수로 자동으로 만들어진다.
		 - 클래스 자기자신의 정보를 가지고 있는 변수
		 */
		TestClass01 t = new TestClass01(); //t는 주소정보를 가지고 있는 참조형변수
		System.out.println("t: "+t);
		System.out.println("main: "+t.num);
		t.test();
		
	}

}
