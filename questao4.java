package generation;
import java.util.Scanner;
public class questao4 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int a, b, c;
		double r,s,d;
		
		System.out.println("Digite o primeiro n�mero: ");
		a = leia.nextInt();
		System.out.println("Digite o segundo n�mero: ");
		b = leia.nextInt();
		System.out.println("Digite o terceiro n�mero: ");
		c = leia.nextInt();
		
		r = Math.pow((a+b), 2);
		s = Math.pow((b+c), 2);
		d = (r+s)/2;
		
		System.out.println("O resultado da equa��o � " + d);
	}
}