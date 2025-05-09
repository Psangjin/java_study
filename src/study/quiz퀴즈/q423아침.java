package study.quiz퀴즈;

public class q423아침 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		prac1 ();
	//	prac2 ();
	//	prac3 ();
	//	prac4 ();
		
		
		
	}
	
	
	public static void prac1() {
		
	int[][]arr = new int [4][4];
	
	int num =16 ;
	for (int i=0; i<arr.length; i++ ) {
		for (int j=0; j< arr.length; j++) {
			arr [i][j] = num--;
			num -- ;
			System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
	}
	}
	
	public static void prac2() {
		
		int[][]arr = new int [4][4];
		
		int num =1 ;
		for (int i=0; i<arr.length; i++ ) {
			for (int j=0; j< arr.length; j++) {
				arr [i][j] = (1+i) + (j*4);
				System.out.printf("%3d", arr[i][j]);
				}
				System.out.println();
		}
		
	}
	public static void prac3() {
		
		int[][]arr = new int [4][4];
		
		int num =16 ;
		for (int i=0; i< arr.length ; i++) {
			for (int j=0; j<arr [i].length; j++) {
				System.out.printf("%3d" , arr[i][j]);
			}
			System.out.println();
		}
		
		
	}
	public static void prac4() {

		int num =1 ;
		for (int i=3; i>=0; i-- ) {
			for (int j=3; j>=0; j--) {
				arr [i][j] = num++;
	}
}
                          for (int i=0; i<arr.length; i++) {
                        	  for(int j=0; j<arr.length; j++ )
                          }
	}
}
		