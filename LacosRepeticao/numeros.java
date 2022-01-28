package LacosRepeticao;

import java.util.Scanner;

public class numeros {

	public static void main(String[] args) {
		/*
	  	3- Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
		21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
		idade for =-99. (WHILE)
		 */
			
		int idade=0, pessoasMenor21=0, pessoasMaior50=0;
		Scanner ler = new Scanner(System.in);
		
		while(idade != -99) {
			
			System.out.print("Entre com a idade da pessoa: ");
			idade = ler.nextInt();
			
			if(idade<21 && idade >=0) {
				pessoasMenor21++;
			}else if(idade>50) {
				pessoasMaior50++;
			}
			
		}
		
		System.out.println("O total de pessoas menores de 21 é " + pessoasMenor21 
				+ " e as pessoas maiores de 50 é " +  pessoasMaior50);
	}

}
