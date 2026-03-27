package com.sist.exception;

public class 예외처리_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String n1 = "10";
			String n2 = "3";
			int[] arr = {Integer.parseInt(n1), Integer.parseInt(n2)};
			
			int res = arr[0] / arr[2];
			System.out.println(res);
		}
		catch(NumberFormatException | ArrayIndexOutOfBoundsException | ArithmeticException e) { // 다중 에러처리 
			e.printStackTrace();
		}
//		catch (NumberFormatException e) { // 정수변환이 안되는 경우
//			e.printStackTrace();
//		}
//		catch (ArrayIndexOutOfBoundsException e) { // 배열 범위 초과 시 에러
//			e.printStackTrace();
//		}
//		catch (ArithmeticException e) { // 0으로 나누었을 때 에러
//			e.printStackTrace();
//		}
//		catch (Exception e) {
//			e.printStackTrace();
//		}
	}

}
