package SRP.good;

public class DroneGood {
	
	private String name;
	
	public DroneGood(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void hareketEt() {
		System.out.println("Drone Havalandý..");
	}
	
	public void yerTespitEt() {
		System.out.println("Hedef Tespit Edildi...");
	}
	
	public void atesEt() {
		System.out.println("Hedef Vuruldu...");
	}
	
	public void raporVer() {
		System.out.println("Rapor Edildi...");
	}
	
	public void operasyonaCik() {
		hareketEt();
		yerTespitEt();
		atesEt();
		raporVer();
	}

}
