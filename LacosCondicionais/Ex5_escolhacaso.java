package LacosCondicionais;

import java.util.Scanner;

public class Ex5_escolhacaso {

	public static void main(String[] args) {
		/*
		 * 5-	Fa�a um programa que mostre um Menu com op��es 
		 * de um card�pio de restaurante para uma pessoa. 
		 * A pessoa vai escolher o prato desejado: 
		 * 
		 * Ap�s escolher o prato, o programa dever� fazer uma pergunta ao usu�rio,
		 *  se ele aceita pagar a gorjeta do gar�om 10% sobre o valor do prato. 
		 *  Se o usu�rio aceitar, mostrar o valor final (valor do prato + 10%), 
		 *  caso contr�rio, mostrar o valor final (somente o valor do prato).
			
			Codigo		 Prato		 	Valor 
			1 		Picanha 		25,00 
			2 		Lasanha 		20,00 
			3 		Strogonoff 		18,00 
			4 		Bife Acebolado 	15,00 
			5 		P�o com ovo 		5,00 

		 */

		int menu, gorjeta;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("cod: 1 -> Picanha 		 --- R$25,00");
		System.out.println("cod: 2 -> Lasanha 		 --- R$20,00");
		System.out.println("cod: 3 -> Strogonoff 	 --- R$18,00");
		System.out.println("cod: 4 -> Bife Acebolado --- R$15,00");
		System.out.println("cod: 5 -> P�o com ovo 	 --- R$5,00");
		
		menu = ler.nextInt();
		System.out.println("Voc� aceita pagar 10% de gorjeta para o gar�om? ");
		System.out.println("SIM --> 0 \nN�O --> 1 ");
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
				System.out.println("cod: 5 -> P�o com ovo 	 --- R$5,00");
				break;
			default:
					break;
		}
	}

}
