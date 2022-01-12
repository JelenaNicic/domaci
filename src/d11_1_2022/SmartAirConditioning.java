package d11_1_2022;

public class SmartAirConditioning {
	String markaKlime;
	int elHladi;
	int elGreje;
	int temp;
	String mod;

	public void print() {
		System.out.println("Marka klime " + this.markaKlime + "Mod" + this.mod + "Temperatura" + this.temp);

	}

	public int mesecnaPotrosnja() {
		int mesecnaPotrosnja = 0;
		if (this.mod.equals("greje")) {

			mesecnaPotrosnja = 30 * 15 * this.elGreje;
		} else {
			mesecnaPotrosnja = 30 * 15 * this.elHladi;
		}
		return mesecnaPotrosnja;
	}
	/// public kolikoTrosi() {////nisam sigurna kako ovo da uradim

}
		
		
		
		
		
		
		
