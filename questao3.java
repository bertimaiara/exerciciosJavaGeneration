package generation;
import java.util.Scanner;
public class questao3 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int evento, horas, minutos, segundos;
		System.out.println("Quanto tempo durou o evento em segundos? ");
		evento = leia.nextInt();
		horas = evento / 3600;
		minutos = (evento % 3600) / 60;
		segundos = (evento % 3600) % 60;
		
		System.out.println("O evento durou " + horas + " horas " + minutos + " minutos " + segundos + " segundos.");
	}
}