package d_20_1_2022;

public class Trener extends Osoba {
 
	public int godineIskustva;
	public String tipTrenera;
	
	public Trener() {
		super();
	}

    public Trener(String imeIPrezime, int jmbg, int godinuRodjenja,int godineIskustva,String tipTrenera) {
		super(imeIPrezime, jmbg, godinuRodjenja);	
          this.godineIskustva=godineIskustva;
          this.tipTrenera=tipTrenera;
	}
   public void print () {
			super.print();
		System.out.println("Godine iskustva: "+this.godineIskustva+"Tip trenera: "+this.tipTrenera);
		
		
		
	}

}
