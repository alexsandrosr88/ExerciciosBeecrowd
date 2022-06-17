import java.util.Locale;
import java.util.Scanner;

public class ExercicioResolvido01 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		double area;
		double largura, comprimento;
		double preco, valorMetro;
		
		System.out.println("Digite a largura do terreno:");
		largura = sc.nextDouble();
		
			
		System.out.println("Digite o comprimento do terreno:");
		comprimento = sc.nextDouble();
		
		System.out.println("Digite o valor do metro quadrado:");
		valorMetro = sc.nextDouble();
		
		area = largura * comprimento;
		preco = area * valorMetro;
		
		System.out.println();
		
		System.out.printf("AREA = %.2f%n", area);
		System.out.printf("PRECO = %.2f",preco);
		sc.close();
	}
}
