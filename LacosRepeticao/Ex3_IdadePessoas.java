package LacosRepeticao;

import java.util.Scanner;

public class Ex3_IdadePessoas {

	public static void main(String[] args) {
		/*
		  	3- Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
			21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
			idade for =-99. (WHILE)
		 */
		
		int idade=0, pessoasAbaixo21=0, pessoasAcima50=0;
		Scanner sc = new Scanner(System.in);
		
		while(idade!=-99) {
			idade = sc.nextInt();
			if(idade<21) {
				pessoasAbaixo21++;
			}else if(idade>50) {
				pessoasAcima50++;
			}
		}
		
		System.out.println("O total de pessoas com menos de 21 anos é de " + pessoasAbaixo21
				+ " e acima de 50 anos é de " + pessoasAcima50);

	}

}
