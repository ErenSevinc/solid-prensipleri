package LPS.good;

import LPS.Sekil;

public class Kare implements Sekil {
	private int kenar;
	
	public Kare(int kenar) {
		this.kenar = kenar;
	}

	public int getKenar() {
		return kenar;
	}

	public void setKenar(int kenar) {
		this.kenar = kenar;
	}

	@Override
	public void alan() {
		int result = this.kenar * this.kenar;
		System.out.println(result);
	}
	
	

}
