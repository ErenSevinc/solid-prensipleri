package ISP;

public class Iha extends Drone implements IDrone{

	@Override
	public void hareketEt() {
		System.out.println("Drone Havaland�..");
	}

	@Override
	public void yerTespitEt() {
		System.out.println("Hedef Tespit Edildi...");
	}
	
	/*
	@Override
	public void atesEt() {
		// bo� b�rakt�k e�er d�n�� tipi olsayd�  return null diyebilirdik...
	}
	*/

	@Override
	public void raporVer() {
		System.out.println("Rapor Edildi...");
		
	}

	@Override
	public void operasyonaCik() {
		System.out.println(super.getType());
		hareketEt();
		yerTespitEt();
		raporVer();
	}
	

}
