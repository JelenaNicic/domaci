package d_21_1_2022;

public class Magacioner extends Radnik {

	
	public Magacioner() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Magacioner(String imeIPrezime) {
		super(imeIPrezime);
		// TODO Auto-generated constructor stub
	}
	
 private double prosecnaPlata() {
	 double plata=0;
	 double prosek=0;
	 for (int i = 0; i <sektori.size(); i++) {
		 plata=plata+this.sektori.get(i).getPlata();
		
	}
	return  prosek=plata/sektori.size()*0.5;
 }
 @Override
	public double plata() {
		
		return this.prosecnaPlata()*this.sektori.size();
	}
//	Kreirati klasu Magacioner koja nasledjuje klasu Radnik koja:
//		 ima privatnu metodu koja racuna prosecnu platu za sektore u kojima radi radnik kao:
//		 suma plata svih sektor / broj sektora * 0.5
//		 override uje metodu za platu, tako da se plata racuna po formuli:
//		(prosecna plata za sve sektore u kojima radi) * (broj sektora).

	
	
	
	
	
	
	
	
	
	
}
