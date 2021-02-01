package ISP;

import OCP.DroneType;

public class Main {
	public static void main(String[] args) {
		Iha iha =new Iha();
		iha.setType(DroneType.iha);
		iha.operasyonaCik();
		
		Siha siha =new Siha();
		siha.setType(DroneType.siha);
		siha.operasyonaCik();
	}

}
