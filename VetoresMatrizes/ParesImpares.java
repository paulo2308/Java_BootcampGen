package VetoresMatrizes;

import java.util.Scanner;

public class ParesImpares {

	public static void main(String[] args) {
		/*
		   2- Fa�a um programa que receba 6 n�meros inteiros e mostre: 
			� Os n�meros pares digitados;  
			� A soma dos n�meros pares digitados; 
			� Os n�meros �mpares digitados; 
			� A quantidade de n�meros �mpares digitados.
		 */
		
		int soma = 0, contImpar = 0;
		int[] numeros = new int[6];
		
		
		Scanner leia = new Scanner(System.in);
		
		//bloco de leitura
		for(int x=0; x<=5; x++) {
			System.out.print("Digite o " + (x+1) + "� valor: ");
			numeros[x] = leia.nextInt();
		}
		
		leia.close();
		
		//bloco de exibicao
		for(int y=0; y<=5; y++) {
			
			if(numeros[y]%2==0) {
				soma = soma + numeros[y];
				System.out.println("o numero par � " + numeros[y]);
				
			}else if(numeros[y]%2 != 0) {
				contImpar++;
				System.out.println("o numero impar � " + numeros[y]);
			}
		}
		
		System.out.println("A soma dos pares � "+soma);
		System.out.println("A quantidade de numeros impares � igual a "+contImpar);
		
		

	}

}
