package overloading;

class TestClass07{
	public static final String KOREA = "대한민국";
	//final : 값을 변경하지 않을 경우
	//값을 변경하지 않고 공통적으로 많이 사용할 경우 static
}

public class MainClass07 {

	public static void main(String[] args) {
		//TestClass07 t = new TestClass07();
		//t.KOREA="미국";
		System.out.println(TestClass07.KOREA);

	}

}
