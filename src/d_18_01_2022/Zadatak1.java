package d_18_01_2022;

public class Zadatak1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ispit n=new Ispit("srpski", 7, "Mirko Gojkovic");
		Ispit w=new Ispit("matematika", 10, "Mirka Gojkovic");
		Ispit d=new Ispit("Biohemija", 9, "Mirko Mitrovic");
		
		Student jelena=new Student();
        jelena.setBrojIndeksa(4);
        jelena.setImeIPrezime("Bojana Mikic");
        jelena.setTipStudija("Master");
        jelena.dodajIspit(n);
        jelena.dodajIspit(w);
        jelena.dodajIspit(d);
        jelena.print();
        
	
		
		
		
		
	}

}
