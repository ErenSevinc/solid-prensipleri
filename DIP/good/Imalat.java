package DIP.good;

import DIP.good.Kek;

public class Imalat {
	
	private IGida iGida;
	private boolean malzeme;

	public boolean isMalzeme() {
		return malzeme;
	}

	public void setMalzeme(boolean malzeme) {
		this.malzeme = malzeme;
	}
	
	

	public Imalat() {
		iGida = new Kek();
	}

	public void Olustur() {
		iGida.kekYap(this.isMalzeme());
	}

}
