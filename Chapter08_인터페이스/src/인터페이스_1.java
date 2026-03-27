import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

interface II{
	void display(); // public이 생략되어있음
	default void aaa() {}	// 선택적 오버라이딩 가능
}

class A implements II{
	public void display() { // II의 display를 오버라이딩 하려고 할 때 public을 안쓰면 축소되므로 꼭 public을 써줘야함
		
	}
}
class B implements II{
	public void display() {
		
	}
	public void aaa() {
		
	}
}
class C implements II{

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}

}
public class 인터페이스_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
//		List<String> list = new Vector<String>();
//		List<String> list = new LinkedList<String>();
		list.add("홍길동");
		list.add("이순신");
		list.add("심청이");
		for(String str : list) {
			System.out.println(str);
		}
		
		
	}

}