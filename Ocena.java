package ocena;

public class Ocena {
	private int brPoena;
	private String predmet;
	private String rok;
	private static int[] nizOcena;
	private static int brOcena = 0;
	private static double zbirOcena = 0;

	public Ocena(int brPoena, String predmet, String rok) {
		this.brPoena = brPoena;
		this.predmet = predmet;
		this.rok = rok;
		nizOcena = new int[5];
	}

	public void dodaj() {
		if (brOcena < nizOcena.length) {
			if (this.ocena() < 6) {
				System.out.println("Pali ste ispit");
			} else {
				nizOcena[brOcena++] = this.ocena();
			}

		}
	}

	public int ocena() {
		if (brPoena < 50) {
			return 5;
		} else if (brPoena < 60) {
			return 6;
		} else if (brPoena < 70) {
			return 7;
		} else if (brPoena < 80) {
			return 8;
		} else if (brPoena < 90) {
			return 9;
		} else {
			return 10;
		}
	}

	public static double prosek() {
		for (int i = 0; i < brOcena; i++) {
			zbirOcena += nizOcena[i];
		}
		return (zbirOcena / brOcena);
	}

	public static double prosek(Ocena[] nizOcena) {
		for (int i = 0; i < nizOcena.length; i++) {
			zbirOcena += nizOcena[i].ocena();
		}
		return (zbirOcena / brOcena);
	}
}
