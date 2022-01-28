package Logica;

import java.util.Scanner;

public class Ex3_EventoFabrica {

	public static void main(String[] args) {
		/*
		 	3. Fa�a um sistema que leia o tempo de dura��o de um evento em uma f�brica
			expressa em segundos e mostre-o expresso em horas, minutos e segundos.
		 */
		
		int horas, minutos, segundos;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o tempo do evento em segundos: ");
		segundos = sc.nextInt();
		
		sc.close();
		
		horas = segundos/3600;
		minutos = segundos%3600/60;
		segundos = segundos%3600%60;
		
		System.out.println("O tempo de dura��o do evento � de " 
		+ horas + "h " + minutos + "m " + segundos + "s ");
	}

}
