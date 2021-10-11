/*
 * Creare il metodo main dove all'utente viene chiesto l'inserimento di 10 atleti e venga calcolato
 * l'atleta più alto e più basso per tutti e 2 i sessi.
 */
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Atleta atletaMaxM = null;
		Atleta atletaMinM = null;
		Atleta atletaMaxF = null;
		Atleta atletaMinF = null;
		Atleta[] atletaArray = new Atleta[10];
		for(int i = 0; i < atletaArray.length; i++) {
			System.out.println("Inserire il nome dell'atleta n°" + (i + 1));
			String nome = input.nextLine();
			System.out.println("Inserire il cognome dell'atleta n°" + (i + 1));
			String cognome = input.nextLine();
			System.out.println("Inserire il sesso dell'atleta n°" + (i + 1));
			String sesso = input.nextLine();
			System.out.println("Inserire l'altezza dell'atleta n°" + (i + 1));
			int eta = input.nextInt();
			input.nextLine();
			Atleta atleta = new Atleta(nome, cognome, sesso.charAt(0), eta);
			atletaArray[i] = atleta;
		}
		for(Atleta atleta: atletaArray) {
			if(atleta.getSesso() == 'M') {
				if(atletaMaxM == null || atletaMaxM.getAltezza() < atleta.getAltezza()) {
					atletaMaxM = atleta;
				}
				if(atletaMinM == null || atletaMinM.getAltezza() > atleta.getAltezza()) {
					atletaMinM = atleta;
				}
			} else {
				if(atletaMaxF == null || atletaMaxF.getAltezza() < atleta.getAltezza()) {
					atletaMaxF = atleta;
				}
				if(atletaMinF == null || atletaMinF.getAltezza() > atleta.getAltezza()) {
					atletaMinF = atleta;
				}
			}
		}
		System.out.println("L'atleta maschile più alto è");
		System.out.println(atletaMaxM);
		System.out.println("L'atleta maschile più basso è");
		System.out.println(atletaMinM);
		System.out.println("L'atleta femminile più alto è");
		System.out.println(atletaMaxF);
		System.out.println("L'atleta femminile più basso è");
		System.out.println(atletaMinF);
	}
}
