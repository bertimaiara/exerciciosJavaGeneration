package generation;
import java.util.Scanner;
public class questao1 {
	public static void main(String[] args) {
//pedindo que toda vez que eu chamar o comando leia  ele escaneie a resposta do 
//meu user
		Scanner leia = new Scanner(System.in);
		
		int idade, anos, meses, dias;
		
		System.out.println("Insira a sua idade em anos meses e dias: ");
		System.out.println("Anos: ");
		anos = leia.nextInt();
		System.out.println("Meses: ");
		meses = leia.nextInt();
		System.out.println("Dias: ");
		dias = leia.nextInt();
		
		idade = (anos*365) + (meses*30) + dias;
		System.out.println("A sua idade em dias é: " + idade);
	}
}
