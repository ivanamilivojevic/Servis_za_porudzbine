package pizza;
import java.util.Scanner;

public class ServisZaPorudzbine {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Koliko sastojaka ");
		int broj = sc.nextInt();
		int cena = 200;
		int id = 1;
		System.out.print("sastojci: ");
		while(broj>0) {
			int unos = sc.nextInt();
			switch(unos) {
				case 2: cena+= 50; break;
				case 3: cena+= 40; break;
				case 5: cena+= 30; break;
				case 7: cena+= 40; break;
				default: 
					System.err.println("Greška, željeni sastojak ne postoji u bazi podataka. Pokušajte ponovo"); 
					continue; 
			}
			id *= unos;
			broj--;
		}
		System.out.print("Izabrali ste pizzu ");
		switch(id) {
			case 2*3*5: System.out.println("Cappriciosa"); break;
			case 2*5: System.out.println("Pepperoni"); break;
			case 3*5*7: System.out.println("Vesuvio"); break;
			default: System.out.println("Kombinacija"); break;
		}
		System.out.printf("Cena pizze je %ddin", cena);
	}
}


		