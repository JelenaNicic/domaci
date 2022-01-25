package d_21_1_2022;

public class Zadatak1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Magacioner magacioner=new Magacioner("Ratko");
		Menadzer menadzer=new Menadzer("Petko");
		Sektor sektor=new Sektor("Zdravstvo", 70000);
		Sektor sektor1=new Sektor("Prehrana", 80000);
		Sektor sektor2=new Sektor("Gradjevina", 60000);
		Sektor sektor3=new Sektor("Industrija", 90000);

		magacioner.zaposliSe(sektor3);
		magacioner.zaposliSe(sektor1);
		menadzer.zaposliSe(sektor);
		menadzer.zaposliSe(sektor2);
        double plata1=magacioner.plata();
        System.out.println(plata1);
        double plata=menadzer.plata();
		System.out.println(plata);
		
	}

}
