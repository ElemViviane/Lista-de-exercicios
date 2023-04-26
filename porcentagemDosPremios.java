public class Premio {
/*Um prêmio de 780,000 está sendo dividido para três ganhadores,
 * em 1°lugar receberá 46% do prêmio.
 * em 2°lugar receberá 32% do prêmio.
 * e em 3°lugar receberá o restante.
*/
public static void main(String[] args) {
	double premio = 780.000;
	
	System.out.println("Prêmio de 780.000 reais.\n");
	double  primeiroJogador = premio * 0.46;
	System.out.println("O primeiro jogador receberá: " + primeiroJogador + " Mil");
	double segundoSegundo = premio * 0.32;
	System.out.println("O segundo jogador receberá: " + segundoSegundo + " Mil");
	
	double terceiroJogador = premio - (primeiroJogador + segundoSegundo);
	System.out.println("O terceiro jogador receberá: " + terceiroJogador + " Mil");
	
  }
}
