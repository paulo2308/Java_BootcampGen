package Logica;

import java.util.Scanner;

public class Ex2_IdadeEmDias {

	public static void main(String[] args) {
		/*
		  	2. Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
			expressa em anos, meses e dias.
		 */
		
		int anos;
		int meses;
		int dias;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos dias de vida você tem? ");
		dias = sc.nextInt();
		
		sc.close();
		
		anos = dias/365;
		meses = dias%365/30;
		dias = dias%365%30;
		
		System.out.println("Você tem " + anos + " anos, " + meses + " meses e " + dias + " dias");

	}

}
