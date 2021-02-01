package LPS.bad;

public class Kare extends Dikdortgen{
	

	public Kare(int genislik, int uzunluk) {
		super(genislik, uzunluk);
	}
	
	@Override
    public void setGenislik(int genislik) {
        super.setGenislik(genislik);
        super.setUzunluk(genislik);
    }
	
    @Override
    public void setUzunluk(int uzunluk) {
        super.setUzunluk(uzunluk);
        super.setGenislik(uzunluk);
    }
    
    @Override
    public void alan() {
    	int result = super.getGenislik() * super.getUzunluk();
    	System.out.println(result);
    }
    
	

}
