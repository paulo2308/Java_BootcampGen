package polimorfismo;

public class Cavalo extends Animal {
	
	public Cavalo(String nome, int idade){
		super(nome, idade);
	}

	public void correr() {
		System.out.println("pocotó pocotó pocotó pocotó");
	}
	
	@Override
	public void emitirSom() {
		System.out.println("iiiiiirrrrrííííírrirrirri brrruuuurrruuu");
	}
}
