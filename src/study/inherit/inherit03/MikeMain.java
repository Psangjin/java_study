package study.inherit.inherit03;

public class MikeMain {

	public static void main(String[] args) {

		Mike m1 = new Mike();
		m1.volumeUp();
		m1.check();
		
		WirelessMike wm1 = new WirelessMike();
		wm1.volumeUp();
		
		BluetoothMike bm1 = new BluetoothMike();
		bm1.volumeUp();
		bm1.volumeUp(5);
		
		Mike m2 = new WirelessMike();
		Mike m3 = new BluetoothMike();
		m3.volumeUp();
		
		m2.volumeUp();
		m3.volumeUp();
		m3.check();
		
		bm1.check();
		
		//BluetoothMike bm2 = new WirelessMike();
		//BluetoothMike bm2 = new Mike();
		
		BluetoothMike bm2 = new BluetoothMike() ;
		bm2.isConnect = true;
		bm2.model = "성능굿마이크" ;
		bm2.price = 5000;
		bm2.type = "핀마이크";
		
		String str2 = bm2.toString();
				System.out.println(str2);
				
		//Mike m3 = new BluetoothMike() 		
		m3.check();
		System.out.println(m3.toString());
		
		//Mike m2 = new WirelessMike();
		System.out.println(m2.toString());
		
		//Mike m1 = new Mike();
		m1.model = "일반마이크";
		System.out.println(m1.model);
		System.out.println(m1);
		//객체 자체를 출력 -> toString(	) 결과를 출력
		
		Object o1 = m1;
		o1 = m2;
		o1 = m3;
		o1 = bm2;
		o1 = bm1;
	
	}

}