package Logica;

import java.util.Scanner;

public class Ex8_CarroNovo {

	public static void main(String[] args) {
		/*
		   8. O custo ao consumidor de um carro novo � a soma do custo de f�brica com a
			percentagem do distribuidor e dos impostos (aplicados ao custo de f�brica).
			Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
			escrever um sistema que leia o custo de f�brica de um carro e escreva o custo ao
			consumidor.
		 */

		double custoConsumidor, custoFabrica, percentagem = 0.28, impostos = 0.45;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Custo de f�brica: R$ ");
		custoFabrica = sc.nextDouble();
		
		custoConsumidor = custoFabrica + custoFabrica*percentagem*impostos;
		
		sc.close();
		
		System.out.println("O custo ao consumidor de um carro novo � R$ " + custoConsumidor);
	}

}
