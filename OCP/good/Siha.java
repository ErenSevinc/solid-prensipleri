package OCP.good;

import OCP.IDrone;

public class Siha extends Drone implements IDrone {

	@Override
	public void operasyonaCik() {
		System.out.println(super.getType());
		super.hareketEt();
		super.yerTespitEt();
		super.atesEt();
		super.raporVer();
		
	}
	

}
