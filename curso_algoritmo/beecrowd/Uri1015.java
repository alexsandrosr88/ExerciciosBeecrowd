package curso_algoritmo.beecrowd;

import java.util.Scanner;

public class Uri1015 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double x1 = sc.nextDouble();
		double x2 = sc.nextDouble();
		double y1 = sc.nextDouble();
		double y2 = sc.nextDouble();
		
		double distancia = Math.sqrt((Math.pow((x1 - y1),2) + Math.pow((x2 - y2),2)));
		
		System.out.printf("%.4f\n",distancia);
		
		sc.close();
	}
}
