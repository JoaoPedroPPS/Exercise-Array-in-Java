package exercise01;
import java.util.Scanner;
import java.lang.Math;
import java.util.List;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total = 0;
		float aritme;
		float limiter;
		
		//apparently, for the POW function to work, it has to receive double numbers
		double doubleTotal = 1;
		double doubleLimiter = 0;
		
		System.out.println("Digite a quantidade de n�meros que ser�o trabalhados: ");
		
		// escaneando o tamanho do vetor desejado pelo usuario
		Scanner limitArray = new Scanner(System.in);
		Scanner number = new Scanner(System.in);
		int selectLimit;
		int selectNumber;
		selectLimit = limitArray.nextInt();//salvar tamanho do vetor
		limiter = selectLimit;
		
		
		// criando o vetor, tenho que tirar 1 pois o vetor come�a em 0
		int vetor[] = new int[selectLimit]; 
		
		//armazenando n�meros dentro do vetor
		for(int i=0; i<= (selectLimit - 1); i++) {
			System.out.println("Digite o n�mero na posi��o " + (i + 1) + ": ");
			selectNumber = number.nextInt();
			vetor[i] = selectNumber;
			total = selectNumber + total;
			doubleTotal = selectNumber * doubleTotal;
		}
		//calculando m�dia aritm�tica
		aritme = (total / limiter);
		

		
		//mostrando o vetor
		for(int i=0; i<= (selectLimit - 1); i++) {
			System.out.print(vetor[i] + " | ");
		}
		System.out.println(" ");//apenas para pular uma linha depois de mostrar o vetor
		System.out.println("Total: " + total);//checando o total
		System.out.println("M�dia Aritm�tica : " + aritme);
		
		//calculando a m�dia geom�trica
		
		doubleLimiter = (1 / limiter);
		double geomed = Math.pow(doubleTotal, doubleLimiter);
		System.out.format("M�dia Geom�trica: %.2f", geomed);
		System.out.println(" ");
		
		//Mostra apenas pares
		System.out.println("Vetor de n�meros pares:");
		for(int i=0; i<= (selectLimit - 1); i++) {
			if((vetor[i] % 2) == 0) {
				
				System.out.print(vetor[i] + " | ");
			}
		}
		System.out.println(" ");
		
		
		//Mostra apenas impares
		System.out.println("Vetor de n�meros impares:");
				for(int i=0; i<= (selectLimit - 1); i++) {
					if((vetor[i] % 2) != 0) {
						
						System.out.print(vetor[i] + " | ");
					}
				}
		System.out.println(" ");
				
			
		
	}//fim do main ARGS

}//fim da classe Main
