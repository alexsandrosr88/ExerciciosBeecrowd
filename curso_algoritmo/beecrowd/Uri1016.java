package curso_algoritmo.beecrowd;

import java.util.Scanner;

public class Uri1016 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int d = sc.nextInt();
		
		int tempo = (d * 60)/30;
		
		System.out.println(tempo +" minutos");
		
		sc.close();

	}

}
