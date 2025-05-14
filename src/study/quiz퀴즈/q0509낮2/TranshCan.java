package study.quiz퀴즈.q0509낮2;

public class TranshCan {

	int liter;
	String color;
	
	int trashPercentage; //쓰레기가 용량 몇퍼센트 차있는지 70 80
	
	boolean isCoverOpened; //뚜껑이 열려있냐?
	
	public void openCover() {	//연다
		isCoverOpened = true;
	}
	public void closeCover() {	//닫는다
		isCoverOpened = false;
	}
	
	//쓰레기 비운다
	public void clearTrash() {
		trashPercentage = 0;
	}
	//쓰레기 채우기 (쓰레기 쓰레기통에 더 버리기)
	public void insertTrash(int percentage) {
		trashPercentage += percentage;
		//30% += 5%
		
	}
	public void inserTrashLiter(int trashLiter) {
		//쓰레기 3리터 버림
		
		//40리터 짜리 쓰레기통
		
		trashPercentage += (trashLiter/(double)liter) * 100;
		//					소수점. 올림/
		//		3/40 = 
	}
}
