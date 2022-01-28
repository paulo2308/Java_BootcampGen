package Logica;

import java.util.Scanner;

public class Ex6_DistanciaEntrePontos {

	public static void main(String[] args) {
		/*
			6. Construa um programa em c que, tendo como dados de entrada dois pontos
			quaisquer no plano, P(x1, y1) e P(x2, y2), escreva a distância entre eles. A fórmula
			é d = sqrt((x2-x1)^2 + (y2-y1)^2)
		*/
		
		double x, y, d;
		
		Scanner sc =  new Scanner(System.in);
		System.out.print("Digite x2: ");
		x = sc.nextDouble(); //x2
		
		System.out.print("Digite y2: ");
		y = sc.nextDouble(); //y2
		
		System.out.print("Digite x1: ");
		x -= sc.nextDouble(); //x2-x1
		
		System.out.print("Digite y1: ");
		y -= sc.nextDouble(); //y2-y1
		
		sc.close();
		
		d = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
		System.out.print("d = " + d);

	}

}
