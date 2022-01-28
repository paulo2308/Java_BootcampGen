package VetoresMatrizes;

import java.util.Scanner;

public class DuasMatrizes {

	public static void main(String[] args) {
		/*
		   4- Faça um programa que leia duas matrizes 2 x 2 com valores reais. 
		   	Ofereça ao usuário um menu de opções:
			(1) somar as duas matrizes 
			(2) subtrair a primeira matriz da segunda 
			(3) adicionar uma constante as duas matrizes
			(4) imprimir as matrizes 
			Nas duas primeiras opções uma terceira matriz 2 x 2 deve ser criada. 
			Na terceira opção o valor da constante deve ser lido e 
			o resultado da adição da constante deve ser armazenado na própria matriz.

		 */
		
		float[][] m1 = new float[2][2];
		float[][] m2 = new float[2][2];
		float[][] m3 = new float[2][2];
		
		int opcao;
		
		Scanner leia = new Scanner(System.in);
		
		for(int x=0; x<2; x++) {
			for(int y=0; y<2; y++) {
				System.out.print("m1[" + x + "][" + y + "] = ");
				m1[x][y] = leia.nextFloat();
				System.out.print("m2[" + x + "][" + y + "] = ");
				m2[x][y] = leia.nextFloat();
			}
		}
		
		System.out.println("\n\n(1) somar as duas matrizes \n"
				+ "(2) subtrair a primeira matriz da segunda \n"
				+ "(3) adicionar uma constante as duas matrizes\n"
				+ "(4) imprimir as matrizes \n");
		
		System.out.print("Escolha uma das opções acima: ");
		opcao = leia.nextInt();
		
		switch(opcao) {
		case 1:
			for(int x=0; x<2; x++) {
				for(int y=0; y<2; y++) {
					m3[x][y] = m1[x][y]+m2[x][y];
					System.out.print("[" + m3[x][y] + "] ");
				}
				System.out.print("\n");
			}
			break;
		case 2:
			for(int x=0; x<2; x++) {
				for(int y=0; y<2; y++) {
					m3[x][y] = m1[x][y]-m2[x][y];
					System.out.print("[" + m3[x][y] + "] ");
				}
				System.out.print("\n");
			}
			
			break;
		case 3:
			System.out.print("escreva um valor para matriz 1");
			m1[0][0] = leia.nextFloat();
			System.out.println("escreva um valor para matriz 2");
			m2[1][0] = leia.nextFloat();
			
			System.out.println("matriz 1:\n");
			for(int x=0; x<2; x++) {
				for(int y=0; y<2; y++) {
					System.out.print("[" + m1[x][y] + "] ");
				}
				System.out.print("\n");
			}
			
			System.out.println("matriz 2:\n");
			for(int x=0; x<2; x++) {
				for(int y=0; y<2; y++) {
					System.out.print("[" + m2[x][y] + "] ");
				}
				System.out.print("\n");
			}
			break;
		case 4:
			for(int x=0; x<2; x++) {
				for(int y=0; y<2; y++) {
					System.out.print("[" + m1[x][y] + "] ");
				}
				System.out.print("\n");
			}
			
			for(int x=0; x<2; x++) {
				for(int y=0; y<2; y++) {
					System.out.print("[" + m2[x][y] + "] ");
				}
				System.out.print("\n");
			}
			break;
		default:
			System.out.println("\nOpção inválida");
			break;
		}
		
		leia.close();

	}

}
