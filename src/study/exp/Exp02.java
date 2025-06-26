package study.exp;

public class Exp02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = new int [3];
		
		try {
			
			
			//NullPointerException 발생 예시
			//arr = null;
			//arr[1] = 10;
			
			//ArrayIndexOutOfBoundsException 발생 에시
			arr[10]= 10;
			
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException 발생함");
		} catch (NullPointerException e) {
			System.out.println("NullPointerException 발생함");
		} catch (Exception e) {
			System.out.println("Exception 발생함");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

















































