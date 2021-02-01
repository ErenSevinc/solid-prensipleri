package SRP.bad;

public class DroneBad {
	private String name;
	
	public DroneBad(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
		
	public void operasyonaCik() {
		System.out.println("Drone Havalandý");
		System.out.println("Hedef Tespit Edildi");
		System.out.println("Hedef Vuruldu");
		System.out.println("Rapor Edildi");
	}
}
	

