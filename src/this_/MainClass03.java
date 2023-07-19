package this_;
class TestClass03{
	private int num, age;
	
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	//설정할때는 set ==>값을 설정하는 목적으로만 쓴다.
	//get => 특정 변수가 가지고 있는 값을 얻어오는 기능
	public void setNum(int n) {
		num=n;
	}
	public int getNum() {
		return num;
	}
}

public class MainClass03 {
	public static void main(String[] args) {
		TestClass03 t = new TestClass03();
		t.setNum(5);
		System.out.println(t.getNum());

	}

}
