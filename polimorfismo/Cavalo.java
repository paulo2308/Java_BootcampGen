package polimorfismo;

public class Cavalo extends Animal {
	
	public Cavalo(String nome, int idade){
		super(nome, idade);
	}

	public void correr() {
		System.out.println("pocot� pocot� pocot� pocot�");
	}
	
	@Override
	public void emitirSom() {
		System.out.println("iiiiiirrrrr�����rrirrirri brrruuuurrruuu");
	}
}
