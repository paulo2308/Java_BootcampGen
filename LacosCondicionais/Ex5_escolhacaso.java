package LacosCondicionais;

import java.util.Scanner;

public class Ex5_escolhacaso {

	public static void main(String[] args) {
		/*
		 * 5-	Faça um programa que mostre um Menu com opções 
		 * de um cardápio de restaurante para uma pessoa. 
		 * A pessoa vai escolher o prato desejado: 
		 * 
		 * Após escolher o prato, o programa deverá fazer uma pergunta ao usuário,
		 *  se ele aceita pagar a gorjeta do garçom 10% sobre o valor do prato. 
		 *  Se o usuário aceitar, mostrar o valor final (valor do prato + 10%), 
		 *  caso contrário, mostrar o valor final (somente o valor do prato).
			
			Codigo		 Prato		 	Valor 
			1 		Picanha 		25,00 
			2 		Lasanha 		20,00 
			3 		Strogonoff 		18,00 
			4 		Bife Acebolado 	15,00 
			5 		Pão com ovo 		5,00 

		 */

		int menu, gorjeta;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("cod: 1 -> Picanha 		 --- R$25,00");
		System.out.println("cod: 2 -> Lasanha 		 --- R$20,00");
		System.out.println("cod: 3 -> Strogonoff 	 --- R$18,00");
		System.out.println("cod: 4 -> Bife Acebolado --- R$15,00");
		System.out.println("cod: 5 -> Pão com ovo 	 --- R$5,00");
		
		menu = ler.nextInt();
		System.out.println("Você aceita pagar 10% de gorjeta para o garçom? ");
		System.out.println("SIM --> 0 \nNÃO --> 1 ");
		gorjeta = ler.nextInt();
		
		switch(menu){
			case 1:
				System.out.println("cod: 1 -> Picanha 		 --- R$25,00");
				if(gorjeta==0) {
					float pagar = 25.0f*1.1f;
					System.out.println("Valor total a pagar: R$ ");
				}
				break;
			case 2:
				System.out.println("cod: 2 -> Lasanha 		 --- R$20,00");
				break;
			case 3:
				System.out.println("cod: 3 -> Strogonoff 	 --- R$18,00");
				break;
			case 4:
				System.out.println("cod: 4 -> Bife Acebolado --- R$15,00");
				break;
			case 5:
				System.out.println("cod: 5 -> Pão com ovo 	 --- R$5,00");
				break;
			default:
					break;
		}
	}

}
