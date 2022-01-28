package LacosRepeticao;

public class Ex1_IntervaloDeNumeros {

	public static void main(String[] args) {
		/*	
		 * 1- Informar todos os números de 1000 a 1999 que quando divididos por 11	
		 * obtemos resto = 5. (FOR)
		 */
		
		for(int n=1000; n<=1999; n++) {
			if(n%11 == 5) {
				System.out.print(n + " ");
			}
		}

	}

}
