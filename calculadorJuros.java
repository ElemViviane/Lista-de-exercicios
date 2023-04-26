import java.util.Scanner;
//Calculador de juros de 4 estados com % diferentes, com base no valor dos produtos.
public class CalculaJuros {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double produto,valorTotal, estado;
	
		System.out.println("Informe o valor do produto: ");
		produto = sc.nextDouble();
		System.out.println("Informe o estado: 1 para MG, 2 para SP, 3 para RJ, 4 para MS: ");
		estado = sc.nextDouble();
		
		if(estado == 1) {
			valorTotal = (produto * 0.07) + produto;
			System.out.println("O valor final é: " + valorTotal);
			
		}else if(estado == 2) {
			valorTotal = (produto * 0.12) + produto;
			System.out.println("O valor final é: " + valorTotal);
			
		}else if(estado == 3) {
			valorTotal = (produto * 0.15) + produto;
			System.out.println("O valor final é: " + valorTotal);
			
		}else if(estado == 4) {
			valorTotal = (produto * 0.08) + produto;
			System.out.println("O valor final é: " + valorTotal);
			
		}else {
			System.out.println("Erro!!");
		}
	}
}
