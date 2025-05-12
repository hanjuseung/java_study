package study.practice.practice41;

public class TrashCan {

	
	/*
		쓰레기통
		(*주방에 여러개가 있다)
		- 몇리터
		- 색상
		- 용량이 몇퍼센트나 찼는지
		- 쓰레기를 채운다
		- 쓰레기통을 연다
		- 쓰레기통을 닫는다
		- 쓰레기통을 비운다
	 */
	
	int liter;
	String color;
	
	//currentLiter
	int trashPercentage; //쓰레기가 용량 몇퍼센트 차있는지 70 80 80%
	
	boolean isCoverOpened; //뚜껑이 열려있냐?
	
	public void openCover() {	//연다
		isCoverOpened = true;
	}
	
	public void closeCover() {  //닫는다
		isCoverOpened = false;
	}
	
	//쓰레기 비운다
	public void clearTrash() {
		trashPercentage = 0;
	}
	
	//쓰레기 채우기 (쓰레기 쓰레기통에 더 버리기)
	public void insertTrash(int percentage) {
		trashPercentage += percentage;
		//30%  += 5%
	}
	

	public void insertTrashLiter(int trashLiter) {
		// 쓰레기 3리터 버림
		
		//40리터짜리 쓰레기통
		
		trashPercentage += (trashLiter/(double)liter) * 100;
		//				   소수점. 올림/
		//     3/40 = 
	}
}




