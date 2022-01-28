package Logica;

import java.util.Scanner;

public class Ex5_NotasAluno {

	public static void main(String[] args) {
		/*
		 * 5. Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste
			aluno. Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5,
			respectivamente.
		 */
		
		float n1, n2, n3, mf;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Nota 1: ");
		n1 = sc.nextFloat();
		
		System.out.print("Nota 2: ");
		n2 = sc.nextFloat();
		
		System.out.print("Nota 3: ");
		n3 = sc.nextFloat();
		
		sc.close();
		
		mf = (n1*2 + n2*3 + n3*5)/10;
		
		System.out.println("A média final é " + mf);
		
	}

}
