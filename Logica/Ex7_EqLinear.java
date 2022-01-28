package Logica;

import java.util.Scanner;

public class Ex7_EqLinear {

	public static void main(String[] args) {
		/*
		 * 7. Um sistema de equações lineares do tipo:

			[ax+by = c] e [dx+ey = f], pode ser resolvido segundo mostrado abaixo :
		
			x = (ce-bf)/(ae-bd)  e  y = (af-cd)/(ae-bd)
 
			Escreva um sistema que lê os coeficientes a,b,c,d,e e f e calcula e mostra os
			valores de x e y.
		 */

		float a, b, c, d, e, f, x, y;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("a: ");
		a = sc.nextFloat();
		System.out.print("b: ");
		b = sc.nextFloat();
		System.out.print("c: ");
		c = sc.nextFloat();
		System.out.print("d: ");
		d = sc.nextFloat();
		System.out.print("e: ");
		e = sc.nextFloat();
		System.out.print("f: ");
		f = sc.nextFloat();
		
		sc.close();
		
		x = (c*e-b*f)/(a*e-b*d);
		y = (a*f-c*d)/(a*e-b*d);
		
		System.out.print("x = " + x + "\ny = " + y);
		
	}

}
