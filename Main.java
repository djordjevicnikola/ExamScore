package ocena;

public class Main {

	public static void main(String[] args) {
		Ocena o1 = new Ocena(46, "Java", "avgust");
		Ocena o2 = new Ocena(73, "C", "avgust");
		Ocena o3 = new Ocena(68, "C++", "avgust");
		Ocena o4 = new Ocena(99, "QA", "avgust");
		o1.dodaj();
		o2.dodaj();
		o3.dodaj();
		o4.dodaj();
		Ocena[] niz = { o2, o3, o4 };
		System.out.println(Ocena.prosek(niz));
	}
}
