import java.util.Scanner;
/*Informar 7 números e informar quantos estao de 0 á 100,
 * quantos números estão de 101 á 200 e quantos números são maiores que 200.
 */
public class Numeros {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero, count1 = 0, count = 0, count2 = 0;
		
		for(int i = 1; i <= 7; i++) {
			System.out.println("Informe um número: ");
			numero = sc.nextInt();
			
			if(numero > 0  && numero <= 100) {
				count++;
				
			}else if(numero >= 101 && numero <= 200){
				count1++;
				
			}else if(numero > 200) {
				count2++;
			}
		}
		System.out.println("A quantidade de números de 0 a 100 foram: " + count);
		System.out.println("A quantidade de números de 101 a 200 foram: " + count1);
		System.out.println("A quantidade de números maiores que 200 foram: " + count2);
	}
}
