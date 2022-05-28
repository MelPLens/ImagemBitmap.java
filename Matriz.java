package lista0905;

import java.security.SecureRandom;

public class desenho {

	public static void main(String[] args) {
    
		final int linha =16;
		final int coluna =16;
    int [][] numeros = new int [16][16];
		
	for(int l=0;l<linha; l++) { // dois for para percorrer toda matriz para fazer a execucao para imprimir a mensagem ao usuario
		for( int c= 0;c<coluna;c++) {
			numeros[l][c]=new SecureRandom().nextInt(100);
		}
	 }
	for(int l=0;l<linha; l++) {
		for( int c= 0;c<coluna;c++) {
			System.out.printf("%d", numeros[l][c]); // uso do system para numeros inteiros para ser imprimidos e tambem a linha e coluna
		}
		System.out.printf("%n");// imprimi cada elemento da linha por cada uma, faz a quebra de inha e continua o processo de imprimir cada elemento das linhas.logo que acaba todas as linhas ele vai sair do comando for.
   }
 }
}
