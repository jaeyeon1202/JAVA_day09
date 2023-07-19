package variable;
//static:클래스 변수로 만들겠다라는 뜻
class TestClass05{
	public static String msg="연습"; //저장소에 미리 만들어진다
	public int num; //객체가 만들어진후 생성된다. 객체를 만들지 않으면? 생성되지 않는다.
	
}

public class MainClass05 {

	public static void main(String[] args) {
		//TestClass05 t = new TestClass05();
		//System.out.println(t.msg);
		System.out.println(TestClass05.msg);//static변수는 클래스 이름으로 접근한다.
		//msg를 static변수로 선언했기 떄문에 객체화를 하지 않아도 사용할 수 있다.

	}

}
