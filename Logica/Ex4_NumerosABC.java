package Logica;

import java.util.Scanner;

public class Ex4_NumerosABC {

	public static void main(String[] args) {
		/*
		  	4. Escreva um sistema que leia três números inteiros e positivos (A, B, C) e
			calcule a seguinte expressão:
			R=(A+B)^2
			S=(B+C)^2
			D=(R+S)/2
		 */

		double A, B, C, R, S, D;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite A: ");
		A = sc.nextInt();
		
		System.out.print("Digite B: ");
		B = sc.nextInt();
		
		System.out.print("Digite C: ");
		C = sc.nextInt();
		
		sc.close();
		
		if(A>=0 && B>=0 && C>=0) {
			R = Math.pow((A+B),2);
			S = Math.pow((B+C),2);
			D = (R+S)/2;
			
			System.out.println(R);
			System.out.println(S);
			System.out.println("D = ("+R+" + "+S+")/2 = "+D);
		}
		
		
	}

}
