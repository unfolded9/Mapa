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
		mapa[1].addEntry(mapa[0], null, null, mapa[2]);
		mapa[2].addEntry(null, null, mapa[1], mapa[3]);
		mapa[3].addEntry(null, mapa[5], mapa[2], mapa[4]);
		mapa[4].addEntry(null, null, mapa[3], null);
		mapa[5].addEntry(mapa[3], mapa[6], null, null);
		mapa[6].addEntry(null, mapa[5], null, null);
		
		
		Miejsce meRn = mapa[0];
		Scanner scan = new Scanner(System.in);
		int opt;
		
		while(!meRn.equals(mapa[6])) {
			System.out.println("=====================");
			System.out.println("Jesteś w "+meRn.getName());
			System.out.println("Możesz iść \n"+meRn.returnEntry());
			System.out.println("=====================");
			do {
			System.out.println("Dokąd chcesz zmierzać?");
			opt = scan.nextInt();
			}while(!(opt==1||opt==2||opt==3||opt==4));
			int i=0;
			switch(opt) {
			case 1:
				i=0;
				break;
			case 2:
				i=1;
				break;
			case 3:
				i=2;
				break;
			case 4:
				i=3;
				break;
			}
			if(meRn.chooseEntry(i)!=null)
				meRn=meRn.chooseEntry(i);
			else
				System.out.println("!!Nie ma takiego kierunku!! \n");
		}
		System.out.println("Wygrałeś!");
		System.out.println("GAME OVER");
	}

}
