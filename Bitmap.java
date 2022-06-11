package lista0905;


import java.util.Scanner;

public class desenho {

	public static void main(String[] args) {
    Scanner ler = new Scanner (System.in);
    int i,j,m[][]= new int [16][16];
    
    		
		
	for( i = 0;i < 16 ; i++) { // dois for para percorrer toda matriz para fazer a execucao para imprimir a mensagem ao usuario
    System.out.printf("informe os elementos %da linha/n", (i+1));
		for( j = 0; j<16 ; j ++) {
			System.out.printf("m[%d][%d] = " , i, j);
			m[i][j] =ler.nextInt();
		}
		System.out.printf("\n");
	 }
	System.out.printf("\n");
	for( i = 0;i < 16 ; i++) { 
	System.out.printf("%da. linha ", (i+1));
			for( j = 0; j<16 ; j ++) {
				System.out.printf("%d " ,m[i][j]);
			
			}
			System.out.printf("\n");
 }
}
}
