package DIP.good;

public class Kek implements IGida {

	@Override
	public void kekYap(boolean malzeme) {
		if(malzeme) {
			System.out.println("Kek yap�ld�...");
		}
		else {
		System.out.println("Malzeme yok..");
		}
	}

}
