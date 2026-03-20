class Value {
	int a;
	int b;
	
}

class callByValue {
	void swap(int a, int b) {
		System.out.println("변경 전 : a = " + a + " b = "+ b);
		int temp = a;
		a = b;
		b = temp;
		System.out.println("변경 후 : a = " + a + " b = "+ b);
	}
	void swap2(String s1, String s2) {
		System.out.println("변경 전 : s1 = " + s1 + " s2 = "+ s2);
		String temp = s1;
		s1 = s2;
		s2 = temp;
		System.out.println("변경 후 : s1 = " + s1 + " s2 = "+ s2);
		
	}
}

class CallByReference {
	void swap (int[] arr) {
		System.out.println("수행 전 arr[0]:"+arr[0]+" arr[1]:"+arr[1]);
		int temp=arr[0];
		arr[0] = arr[1];
		arr[1] = temp;
		System.out.println("수행 후 arr[0]:"+arr[0]+" arr[1]:"+arr[1]);
	}
	
	void swap2(Value v) {
		System.out.println("swap2:"+v);
		System.out.println("수행 전 v.a:"+v.a+" v.b:"+v.b);
		int temp=v.a;
		v.a = v.b;
		v.b = temp;
		System.out.println("수행 후 v.a:"+v.a+" v.b:"+v.b);
	}
}

class Test{
	int a = 10;
	void display() {
		System.out.println("a = " + a);
		a++;
	}
}
public class 메소드_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		callByValue call = new callByValue();
		int a = 10;
		int b = 20;
		call.swap(a, b);
		System.out.println("CallByValue int 수행 후 원본 a = " + a + " b = "+ b);
		// 모든 클래스와 배열 => Call By Reference
		// String => Call By Value 수행
		String s1 = "Hello";
		String s2 = "Java";
		call.swap2(s1, s2);
		System.out.println("CallByValue string 수행 후 원본 a = " + s1 + " b = "+ s2);
		
		CallByReference cr = new CallByReference();
		int[] arr = {1,2};
		cr.swap(arr);
		System.out.println("CallByReference int 수행 후 원본 arr[0] = " + arr[0] + " arr[1] = "+ arr[1]);
		
		int[] data = {10,20};
		int[] copy = data;
		
		System.out.println("data : "+ data);
		System.out.println("copy : "+ copy);
		copy[0] = 100;
		System.out.println("data[0] :" + data[0]);
		
		int[] copy2 = data.clone();
		
		System.out.println("data : "+ data);
		System.out.println("copy : "+ copy);
		copy2[1] = 100;
		System.out.println("data[1] :" + data[1]);
		
		Value v = new Value();
		System.out.println("main:v="+v);
		v.a = 100;
		v.b = 200;
		cr.swap2(v);
		System.out.println("CallByReference Value 수행 후 원본 v.a = " + v.a + " v.b = "+ v.b);
		
		new Test().display();
		new Test().display();
		new Test().display();
		
		Test t = new Test();
		t.display();
		t.display();
		t.display();

	}

}
