package study.inherit.inherit05.v3;

import java.util.ArrayList;
import java.util.List;

public class Main03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//청소
		Cleaner c1 = new Cleaner();
		Cleaner c2 = new DustCleaner();
		Cleaner c3 = new WindowCleaner();
		Cleaner c4 = new FloorCleaner();
		
		List<Cleaner> list = new ArrayList<Cleaner>();
		list.add(new DustCleaner());
		list.add(new DustCleaner());
		list.add(new DustCleaner());
		list.add(new WindowCleaner());
		list.add(new WindowCleaner());
		list.add(new WindowCleaner());
		list.add(new FloorCleaner());
		list.add(new FloorCleaner());
		list.add(new FloorCleaner());
		
		for(Cleaner c: list) {
			c.doCleaner();
			
			
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
		
	}

	}
}
