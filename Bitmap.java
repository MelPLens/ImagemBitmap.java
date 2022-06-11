package lista0905;


import java.util.Scanner;

public class desenho {

	public static void main(String[] args) {
    Scanner ler = new Scanner (System.in);
    int i,j,m[][]= new int [16][16]; //declaro a variavel i,j e m para o tamanho da minha matriz de 16 por 16. no qual ' i' seria as linhas 'j' seria as colunas 'm' seria matriz junto com colchetes.
    
    		
		
	for( i = 0;i < 16 ; i++) { // declaro dois 'for' laco de repeticao  para percorrer toda matriz para fazer a execucao para imprimir a mensagem ao usuario.
    System.out.printf("informe os elementos %da linha ", (i+1));// i +1 pois vai adicionando as informações dada pelo usuario para estruturar toda a matriz.
		for( j = 0; j<16 ; j ++) {
			System.out.printf("m[%d][%d] = " , i, j); // declara em qual local da matriz esta sendo inserido a informação do usuário.
			m[i][j] =ler.nextInt();
		}
		System.out.printf("\n"); // pulas as linhas para o usuário responder de forma organizada.
	 }
	System.out.printf("\n");
	for( i = 0;i < 16 ; i++) { 
	System.out.printf("%da. linha ", (i+1));
			for( j = 0; j<16 ; j ++) {
				System.out.printf("%d " ,m[i][j]);
			
			}
			System.out.printf("\n"); // imprimir a matriz com o desenho estruturado com as informações recebidas do usuário.
 }
}
}
