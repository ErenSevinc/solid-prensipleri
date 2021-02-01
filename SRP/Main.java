package SRP;

import SRP.bad.DroneBad;
import SRP.good.DroneGood;

public class Main {

	public static void main(String[] args) {
		DroneBad drone1 = new DroneBad("sihaBad");
		drone1.operasyonaCik();
		
		DroneGood drone2 = new DroneGood("sihaGood");
		/*
		drone2.hareketEt();
		drone2.yerTespitEt();
		drone2.atesEt();
		drone2.raporVer();
		*/
		drone2.operasyonaCik();
	}

}
