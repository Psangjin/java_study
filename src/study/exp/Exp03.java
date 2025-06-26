package study.exp;

import java.util.ArrayList;
import java.util.List;

public class Exp03 {

	public static void main(String[] args) {
		
		Sample s = new Sample();
		
		try {
			s.addItem1("111");
		} catch (Exception e) {
			System.out.println("main addItem1 호출 부분 catch block");
		}
		
		//s.addItem1("111");
		
		s.addItem2("222");
		
		try {
			s.addItem3("111");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			s.addItem4("111");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
		try {
			s.addItem5("555");
		} catch (Exception e) {
			System.out.println("main addItem5 호출 부분 catch block");
			//e.printStackTrace();
		}
		
		int result6 = s.addItem6("666");
		if(result6 == 1) { //잘된거~
			
		}
		
		if(result6 == -1) { //뭔가 문제가 있다!
			
		}
		
		try {
			s.addItem7("777");
		} catch (ListFullException e) {
			e.printStackTrace();
		} catch (InvalidParameterValueException e) {
			e.printStackTrace();
		}

		
		try {
			s.addItem8("888");
		} catch (MyCustomException e) {
			e.printStackTrace();
			
			if(e.exceptionCode == 99) {
				
			}
			if(e.exceptionCode == 120) {
				
			}
		}
		
	}

}


class Sample {
	
	List<String> list;  //null 이 들어가있다.
	
	void addItem1(String s) {
		list.add(s);
	}
	
	void addItem2(String s) {
		try {
			list.add(s);
		} catch (Exception e) {
			System.out.println("Sample addItem2 catch block");
			
			if(list == null) {
				list = new ArrayList<String>();
				list.add(s);
			}
		}
	}
	
	void addItem3(String s) throws Exception {
		list.add(s);
	}
	
	void addItem4(String s) throws ClassNotFoundException {
		try {
			list.add(s);
		} catch (Exception e) {
			System.out.println("Sample addItem4 catch block");
		}
	}
	
	//throws : 메소드 선언부분 뒤에 붙여서, 예외떠넘기기가 발생할 수 있다고 경고!!
	//throw : 실제로 예외를 떠넘겨버리기!! 수행!!  "예외를 던져라"
	
	void addItem5(String s) throws Exception {
		try {
			list.get(30);
		} catch (Exception e) {
			System.out.println("Sample addItem5 catch block");
			throw e; //예외를 던져라!! 떠넘기는걸 수행해라!!
		}
	}
	
	int addItem6(String s) {
		//리턴값 : 1 정상작동  -1 뭔가 문제가있다!!
		try {
			list.add(s);
		} catch (Exception e) {
			return -1;
		}
		
		return 1;
		
		// -1 저장실패
		// -2 불러오기 실패
		// -3 인덱스 실패
		// -4 .....
	}
	
	void addItem7(String s) throws ListFullException, InvalidParameterValueException {
		
		if(s == null) {
			throw new InvalidParameterValueException();
		}
		
		try {
			
			if(list.size() == 10) {
				throw new ListFullException();
			} else {
				list.add(s);
			}
			
		} catch (Exception e) {
			//throw e;
			throw new ListFullException();
		}
	}
	
	
	void addItem8(String s) throws MyCustomException {
		
		if(s == null) {
			
			MyCustomException me = new MyCustomException();
			me.exceptionCode = 20;
			
			throw me;
		}
		
		try {
			
			if(list.size() == 10) {
				MyCustomException me = new MyCustomException();
				me.exceptionCode = 120;
				
				throw me;
			} else {
				list.add(s);
			}
			
		} catch (Exception e) {
			//throw e;
			MyCustomException me = new MyCustomException();
			me.exceptionCode = 99;
			
			throw me;
		}
	}
}


//Custom Exception
class ListFullException extends Exception {
}

class InvalidParameterValueException extends Exception{
}

class MyCustomException extends Exception {
	int exceptionCode;
	
	// 10
	// 20
	// 30
	// 99
	// 120
}













