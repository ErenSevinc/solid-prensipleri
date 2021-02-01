package LPS;

import LPS.bad.Dikdortgen;
import LPS.bad.Kare;


public class Main {
	public static void main(String[] args) {
		Dikdortgen dikdortgen1 = new Kare(10,10);
		dikdortgen1.alan();
		
		Dikdortgen dikdortgen2 = new Dikdortgen(10, 5);
		dikdortgen2.alan();
		System.out.println("*********");
		
		LPS.good.Kare kare3 = new LPS.good.Kare(20);
		kare3.alan();
		
		LPS.good.Dikdortgen dikdortgen4 =new LPS.good.Dikdortgen(20, 10);
		dikdortgen4.alan();
	}
}
