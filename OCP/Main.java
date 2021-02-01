package OCP;

import OCP.bad.Drone;
import OCP.good.Iha;
import OCP.good.Siha;

public class Main {
	public static void main(String[] args) {
		Drone d1 = new Drone();
		d1.setType(DroneType.iha);
		d1.operasyonaCik();
		
		Drone d2 = new Drone();  //2
		d2.setType(DroneType.siha);
		d2.operasyonaCik();
		
		System.out.println("*****************");
		
		Iha droneIha = new Iha();
		droneIha.setType(DroneType.iha);
		droneIha.operasyonaCik();
		
		Siha droneSiha =new Siha();
		droneSiha.setType(DroneType.siha);
		droneSiha.operasyonaCik();
		
		
	}
}
