package generation;
import java.util.Scanner;
public class questao2 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int idade, anos, meses, dias;
		System.out.println("Qual a sua idade em dias? ");
		idade = leia.nextInt();
		
		anos = idade / 365;
		meses = (idade % 365) / 30;
		dias = (idade % 365) % 30;
		System.out.println("Você tem " + anos + " anos " + meses + " meses e " + dias + " dias.");
	}
}