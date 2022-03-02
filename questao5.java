package generation;
import java.util.Scanner;
public class questao5 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int media1 = 2, media2 = 3, media3 = 5, soma, mediaPonderada;

		soma = media1 + media2 + media3;
		System.out.println("A soma das médias é: " + soma + "\n");
					
		mediaPonderada = soma / 3;
		System.out.println("A média ponderada é: " + mediaPonderada);

}
}