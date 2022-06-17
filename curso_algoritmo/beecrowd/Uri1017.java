package curso_algoritmo.beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class Uri1017 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int hora = sc.nextInt();
		int veloci = sc.nextInt();
		
		double litros = (veloci*hora) / 12.0;
		
		System.out.printf("%.3f\n",litros);
		
		sc.close();
	}

}
