package Logica;

import java.util.Scanner;

public class Ex2_IdadeEmDias {

	public static void main(String[] args) {
		/*
		  	2. Fa�a um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
			expressa em anos, meses e dias.
		 */
		
		int anos;
		int meses;
		int dias;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos dias de vida voc� tem? ");
		dias = sc.nextInt();
		
		sc.close();
		
		anos = dias/365;
		meses = dias%365/30;
		dias = dias%365%30;
		
		System.out.println("Voc� tem " + anos + " anos, " + meses + " meses e " + dias + " dias");

	}

}
