package study.var;

public class Variable04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				
		
		
		
		//문자열 -> 숫자
		
		String s1 = "1231";
		
		int n1 = 50;
		System.out.println(s1+n1);
		
		// 숫자형 String -> int 바꾸는 방법 이 뭐다?
		int n2 = Integer.parseInt(s1);
			// Integer.parseInt(문자열);	문자열을 int형 숫자로 변환해줌
		
		System.out.println(n1+n2); 				//good...... 문자열 숫자로 변환 됨 Integer.parse
		System.out.println(n1+Integer.parseInt(s1));	// 바로 넣어도 변환 가능
		
		
		String s2= "13.13";
		
		double d1= Double.parseDouble(s2);
				// Double.parseDouble(문자열);	문자열을 double형 숫자로 변환
		
		
		boolean b1 = true;
		b1 = false;
		
		String s3 = "false";
		boolean b2 = Boolean.parseBoolean(s3);
		
		
		//숫자 -> 문자열
		String s4 = String.valueOf(true);
		String s5 = String.valueOf(1512);
		String s6 = String.valueOf(155.222);
		
		String s7 = 1512 + "";	//"1512"	< "//" 슬래시만 넣어도 문자열로 변환가능 > 
		
		
		
		
	}

}
