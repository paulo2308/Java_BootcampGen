package LacosRepeticao;

import java.util.Random;

public class Ex2_ParesImpares {

	public static void main(String[] args) {
		/* 
		 * 2- Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
		 */
		
		Random random = new Random();
		int n, impar = 0, par = 0;
		
		for(int i=0; i<10; i++) {
			n = random.nextInt(100);
			System.out.print(n + " ");
			if(n%2 == 0) {
				par++;
			}else {
				impar++;
			}
		}
		
		System.out.println("Foram lidos " + par + " numeros pares");
		System.out.println("Foram lidos " + impar + " numeros impares");
	}

}
