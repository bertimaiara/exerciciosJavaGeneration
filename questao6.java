package generation;
import java.util.Scanner;
public class questao6 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int p1, p2, x1, y1, x2, y2, d, expoente=2;
		
		System.out.println("Digite um valor para x1: ");
		x1 = leia.nextInt();
		System.out.println("Digite um valor para y1: ");
		y1 = leia.nextInt();	
		System.out.println("Digite um valor para x2: ");
		x2 = leia.nextInt();	
		System.out.println("Digite um valor para y2: ");
		y2 = leia.nextInt();	
		
		p1= (int) Math.pow((x2-x1),2.0);
		p2= (int) Math.pow((y2-y1),2.0);
		d = (int) Math.sqrt((p1+p2));
		System.out.print("O valor da equação é ");
		System.out.print(d);
}
}