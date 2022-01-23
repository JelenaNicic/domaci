package d_21_1_2022;

public class Menadzer extends Radnik {

	
	
	
	
	
	
	

	public Menadzer() {
		super();
	}

	public Menadzer(String imeIPrezime) {
		super(imeIPrezime);
	}

	@Override
	public double plata() {
	double plata=0;
	for (int i = 0; i <sektori.size(); i++) {
	plata=plata+this.sektori.get(i).getPlata();
	}
		return plata;
	}

}
