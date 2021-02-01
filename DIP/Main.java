package DIP;

import DIP.bad.Imalat;

public class Main {
	public static void main(String[] args) {
		Imalat iml = new Imalat();
		iml.setMalzeme(false);
		iml.Olustur();
		
		DIP.good.Imalat iml2 = new DIP.good.Imalat();
		iml2.setMalzeme(true);
		iml2.Olustur();
	}
	
}
