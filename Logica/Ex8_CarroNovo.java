package Logica;

import java.util.Scanner;

public class Ex8_CarroNovo {

	public static void main(String[] args) {
		/*
		   8. O custo ao consumidor de um carro novo é a soma do custo de fábrica com a
			percentagem do distribuidor e dos impostos (aplicados ao custo de fábrica).
			Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
			escrever um sistema que leia o custo de fábrica de um carro e escreva o custo ao
			consumidor.
		 */

		double custoConsumidor, custoFabrica, percentagem = 0.28, impostos = 0.45;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Custo de fábrica: R$ ");
		custoFabrica = sc.nextDouble();
		
		custoConsumidor = custoFabrica + custoFabrica*percentagem*impostos;
		
		sc.close();
		
		System.out.println("O custo ao consumidor de um carro novo é R$ " + custoConsumidor);
	}

}
