import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Miejsce[] mapa = new Miejsce[7];
		
		mapa[0] = new Miejsce("Start");
		mapa[1] = new Miejsce("M1");
		mapa[2] = new Miejsce("M2");
		mapa[3] = new Miejsce("M3");
		mapa[4] = new Miejsce("M4");
		mapa[5] = new Miejsce("M5");
		mapa[6] = new Miejsce("Koniec");
		
		mapa[0].addEntry(null, mapa[1], null, null);
		mapa[1].addEntry(mapa[0], mapa[1], null, mapa[2]);
		mapa[2].addEntry(null, null, mapa[1], mapa[3]);
		mapa[3].addEntry(null, mapa[5], mapa[2], mapa[4]);
		mapa[4].addEntry(null, null, mapa[3], null);
		mapa[5].addEntry(mapa[3], mapa[6], null, null);
		mapa[6].addEntry(null, mapa[5], null, null);
		
		
		Miejsce meRn = mapa[0];
		Scanner scan = new Scanner(System.in);
		
		while(!meRn.equals(mapa[6])) {
			System.out.println("Jesteś w "+meRn.getName());
			System.out.println("Możesz iść \n "+meRn.returnEntry());
		}
	}

}
