package study.practice;

public class practice18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[][]arr = new int [4][4];
		
		for (int 1=0; i<arr.length; i++) {
			for (int j=0; j<arr[i].length; j++) {
				arr[i][j] = num++ ;
				//num ++ ;
			}
		}
		
		for (int i=0; i< arr.length ; i++) {
			for (int j=0; j<arr [i].length; j++) {
				System.out.printf("%3d" , arr[i][j]);
			}
			System.out.println();
		}
		
	}

}
