package DIP.bad;

public class Imalat {
	private boolean malzeme;

	public boolean isMalzeme() {
		return malzeme;
	}

	public void setMalzeme(boolean malzeme) {
		this.malzeme = malzeme;
	}

	public void Olustur() {
		Kek kek = new Kek();
		kek.kekYap(this.isMalzeme());
	}

}
