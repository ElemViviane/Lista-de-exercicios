import java.util.Scanner;
//Faça um programa que solicite ao usuário uma lista de 3 números
// e informe seu maior e menor número.

public class MaiorEMenorNumeroDaLista {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero, numeroDois, numeroTres;
		
		System.out.println("Informe um número: ");
		numero = sc.nextInt();
		System.out.println("Informe um número: ");
		numeroDois = sc.nextInt();
		System.out.println("Informe um número: ");
		numeroTres = sc.nextInt();
		
		if((numero > numeroDois) && (numero > numeroTres)){
			System.out.println("Este número é o maior: " + numero);
			
		} else if ((numeroDois > numero) && (numeroDois > numeroTres)) {
			System.out.println("Este número é o maior: " + numeroDois);
			
		} else if ((numeroTres > numero) && (numeroTres > numeroDois)) {
			System.out.println("Este número é o maior: " + numeroTres);
		} 
		
		if((numero < numeroDois) && (numero < numeroTres)) {
			System.out.println("Este número é o menor: " + numero);
			
		} else if ((numeroDois < numero) && (numeroDois < numeroTres)) {
			System.out.println("Este número é o menor " + numeroDois);
			
		} else if ((numeroTres < numero) && (numeroTres < numeroDois)) {
			System.out.println("Este número é o menor: " + numeroTres);
		}
	}
}
