import java.util.Scanner;
//Fazer um programa que peça ao usuário um número e imprima se ele é primo ou não.
public class NumeroPrimo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numeroPrimo, divisor = 0;
		
		System.out.println("Informe um número: ");
		numeroPrimo = sc.nextInt();
		
		for(int i = 1; i <= numeroPrimo; i++) {
			if(numeroPrimo % i == 0) {
				divisor++;
			}
		}
		if(divisor == 2) {
			System.out.println("Esse número digitado é primo.");
			
		} else {
			System.out.println("Esse número digitado não é primo.");
		}
	}
}
