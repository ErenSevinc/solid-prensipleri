package LPS.bad;

public class Dikdortgen {
	private int genislik;
    private int uzunluk;
    
	public Dikdortgen(int genislik, int uzunluk) {
        this.genislik = genislik;
        this.uzunluk = uzunluk;
    }
	
	public int getGenislik() {
		return this.genislik;
	}

    public void setGenislik(int genislik) {
        this.genislik = genislik;
    }
    
    public int getUzunluk() {
		return this.uzunluk;
	}
    
    public void setUzunluk(int uzunluk) {
        this.uzunluk = uzunluk;
    }
    
    public void alan() {
    	int result = this.genislik * this.uzunluk;
    	System.out.println(result);
    }

}
