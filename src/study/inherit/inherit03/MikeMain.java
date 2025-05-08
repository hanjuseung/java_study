package study.inherit.inherit03;

public class MikeMain {

	public static void main(String[] args) {
		
		Mike m1 = new Mike();
		m1.volumeUp();
		
		WirelessMike wm1 = new WirelessMike();
		wm1.volumeUp();
		
		BluetoothMike bm1 = new BluetoothMike();
		bm1.volumeUp();
		bm1.volumeUp(5);
		
		Mike m2 = new WirelessMike();
		Mike m3 = new BluetoothMike();
		
		m2.volumeUp();
		m3.volumeUp();
		m3.check();
		
		bm1.check();
		
		//BluetoothMike mb2 = new WirelessMike();
		//BluetoothMike mb2 = new Mike();

	}

}
