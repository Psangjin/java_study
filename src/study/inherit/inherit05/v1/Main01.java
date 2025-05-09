package study.inherit.inherit05.v1;

import java.util.ArrayList;
import java.util.List;

public class Main01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//청소
//		 FloorCleaner fc1 = new FloorCleaner();
//		 FloorCleaner fc2 = new FloorCleaner();
//		 FloorCleaner fc3 = new FloorCleaner();
//		 
//		 fc1.cleanFloor();
//		 fc2.cleanFloor();
//		 fc3.cleanFloor();
//		 
//		 WindowCleaner wc1 = new WindowCleaner();
//		 
//		 DustCleaner dc1 = new DustCleaner();
//		  개별적으로 관리하는게 아니라 
		
		 DustCleaner[] dustArr = new DustCleaner[3];
		 dustArr[0] = new DustCleaner();
		 dustArr[1] = new DustCleaner();
		 dustArr[2] = new DustCleaner();
		
		 List<WindowCleaner> windowList 
		 	= new ArrayList<WindowCleaner>(); 
		 windowList.add(new WindowCleaner() );
		 windowList.add(new WindowCleaner() );
		 windowList.add(new WindowCleaner() );
		 
		 
		 List<FloorCleaner> floorList 
		 	= new ArrayList<FloorCleaner>();
		 floorList.add(new FloorCleaner());
		 floorList.add(new FloorCleaner());
		 floorList.add(new FloorCleaner());
		 
		 for(int i=0; i<dustArr.length; i++) {
			 dustArr[i].removeDust();
		 }
		 for(int i=0; i<windowList.size(); i++) {
			 windowList.get(i).washWindow();
			 
		 for( FloorCleaner fc : floorList)
			 fc.cleanFloor();
		 }
	}

}
