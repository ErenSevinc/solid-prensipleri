package ISP;

public class Siha extends Drone implements IDrone,IDroneSiha {

	@Override
	public void hareketEt() {
		System.out.println("Drone Havaland�..");
	}

	@Override
	public void yerTespitEt() {
		System.out.println("Hedef Tespit Edildi...");
	}

	@Override
	public void atesEt() {
		System.out.println("Hedef Vuruldu...");
	}

	@Override
	public void raporVer() {
		System.out.println("Rapor Edildi...");
	}

	@Override
	public void operasyonaCik() {
		System.out.println(super.getType());
		hareketEt();
		yerTespitEt();
		atesEt();
		raporVer();
	}

}
