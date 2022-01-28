package Logica;

import java.util.Scanner;

public class Ex3_EventoFabrica {

	public static void main(String[] args) {
		/*
		 	3. Faça um sistema que leia o tempo de duração de um evento em uma fábrica
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
		
		System.out.println("O tempo de duração do evento é de " 
		+ horas + "h " + minutos + "m " + segundos + "s ");
	}

}
