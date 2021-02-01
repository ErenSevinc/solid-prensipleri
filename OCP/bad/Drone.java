package OCP.bad;

import OCP.DroneType;

public class Drone {
	private DroneType type;

	public DroneType getType() {
		return type;
	}

	public void setType(DroneType type) {
		this.type = type;
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
		System.out.println(this.type);
		if(this.type == type.iha) { //3
			hareketEt();
        	yerTespitEt();
        	raporVer();
		}
		else {
			hareketEt();
    		yerTespitEt();
    		atesEt();
    		raporVer();
		}
            	
    }
		
	
}
