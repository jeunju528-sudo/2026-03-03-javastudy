import java.io.File;

public class String_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		File dir = new File("c:\\javaDev");
//		File[] files = dir.listFiles();
//		
//		for(File f : files) {
//			if(f.isFile()) { // 파일만 가져오기
//				String name = f.getName();
//				String ext = name.substring(name.lastIndexOf(".")+1); // .jpg에서 .을 제외하기 위해 +1을 더해줌
//				System.out.println("name : " + name);
//				System.out.println("ext : " + ext);
//			}
//		}
		
		String msg = "Hello Java!!";
		System.out.println("a의 위치 : " + msg.indexOf("a"));
	}

}
