package OCP;

public enum DroneType {
	iha("iha"), siha("siha");  //1

	private final String type;
	
	DroneType(String type) {
		this.type = type;
	}
}
