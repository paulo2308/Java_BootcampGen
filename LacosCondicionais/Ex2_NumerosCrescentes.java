package application.LacosCondicionais;

import java.util.Scanner;

public class Ex2_NumerosCrescentes {

	public static void main(String[] args) {
		/*
		 * 2-	Faça um programa que entre com três números e coloque em ordem crescente
		 */
		
		int n1, n2, n3, menor, meio, maior;
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite n1: ");
		n1 = ler.nextInt();
		System.out.print("Digite n2: ");
		n2 = ler.nextInt();
		System.out.print("Digite n3: ");
		n3 = ler.nextInt();
		
		if(n1<n2 && n1<n3) {
			
			menor = n1;
			if(n2<n3) {
				meio = n2;
				maior = n3;
			}else {
				meio = n3;
				maior = n2;
			}
			
		}else if(n2<n1 && n2<n3) {
			menor = n2;
			if(n1<n3) {
				meio = n1;
				maior = n3;
			}else {
				meio = n3;
				maior = n1;
			}
		}else if(n3<n1 && n3<n2) {
			menor = n3;
			if(n2<n3) {
				meio = n2;
				maior = n3;
			}else {
				meio = n3;
				maior = n2;
			}
		}
		
		System.out.println(menor + " " + meio + " " + maior);

	}

}
