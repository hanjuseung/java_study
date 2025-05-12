package study.practice.practice41;

import java.util.List;

public class Kitchen {
	
	/*
	주방공간
	- 공간이 몇평인지
	- 벽지색상이 어떤지
	- 층고가 얼마나 되는지
	*/
	
	int floorSpace;  //몇평		24 	32	16 
	String wallColor;  // 검정 흰색  white beige
    int height; //층고 높이   1500 3500 mm 단위
	// 1.5m  2.5m   3.1m    80cm * 60cm   800 * 600  
    
    //Cup cup; //주방에 컵이 있다
    List<Cup> cupList;	// = new ArrayList<Cup>();
    //컵이 여러개 있다 .add(new Cup());
    
    //쓰레기통 여러개
    List<TrashCan> trashCanList;
    
    Refrigerator ref;
    Sink sink;
    GasRange gasRange;
    
}