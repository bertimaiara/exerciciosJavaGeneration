package generation;
import java.util.Scanner;
public class questao8 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double valorCarro, carro, custoConsumidor, imposto=0;
				
		System.out.println("Digite o valor do carro na f�brica: ");
		carro = leia.nextInt();
		
		valorCarro = carro + (carro * 28/100);
		imposto = carro + (carro * 45/100);
		custoConsumidor = valorCarro + imposto;
				
		System.out.print("O valor do carro � ");
		System.out.print(custoConsumidor);
		
	}
}
