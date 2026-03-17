/*
 * 문자열 분리 => split
 * String[] split(String regex)
 *  
 * */

import java.util.Arrays;

public class String_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String color = "red,green,blue,yellow,black,magenta,pink";
		String[] colors = color.split(",");
		System.out.println(Arrays.toString(colors));
		for(String s : colors) {
			System.out.println(s);
		}
		
		color = "red|green|blue|yellow|black|magenta|pink";
		String[] colors2 = color.split("\\|");
		System.out.println(Arrays.toString(colors2));
		
	}

}
