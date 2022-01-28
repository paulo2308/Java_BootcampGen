package Logica;

import java.util.Scanner;

public class Ex1_IdadePessoas {
	public static void main(String[] args) {
		/*
		  	1. Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e
			dias e mostre-a expressa apenas em dias.
		 */
		
		int anos;
		int meses;
		int dias;
		int totalDias;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos anos voce tem? ");
		anos = sc.nextInt();
		
		System.out.print("Quantos meses voce tem? ");
		meses = sc.nextInt();
		
		System.out.print("Quantos dias voce tem? ");
		dias = sc.nextInt();
		
		sc.close();
		
		totalDias = (anos*365)+(meses*30)+dias;
		
		System.out.print("\nVocê viveu um total de "+totalDias+" dias");
	}
}
