package generation;
import java.util.Scanner;
public class questao7 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int x=0, y=0, a, b, c, d, E, f;
		System.out.println("Digite um valor para A: ");
		a = leia.nextInt();
		System.out.println("\nDigite um valor para B: ");
		b = leia.nextInt();
		System.out.println("\nDigite um valor para C: ");
		c = leia.nextInt();
		System.out.println("\nDigite um valor para D: ");
		d = leia.nextInt();
		System.out.println("\nDigite um valor para E: ");
		E = leia.nextInt();
		System.out.println("\nDigite um valor para F: ");
		f = leia.nextInt();
		
		x= ((c*E)-(b*f)) / ((a*E)-(b*d));
		y= ((a*f)-(c*d)) / ((a*E)-(b*d));

		System.out.println("O valor de X é "+ x+ " e Y é "+ y);
	}
}