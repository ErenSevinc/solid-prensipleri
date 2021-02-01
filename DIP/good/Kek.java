package DIP.good;

public class Kek implements IGida {

	@Override
	public void kekYap(boolean malzeme) {
		if(malzeme) {
			System.out.println("Kek yapýldý...");
		}
		else {
		System.out.println("Malzeme yok..");
		}
	}

}
