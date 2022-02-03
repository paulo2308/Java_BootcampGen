package polimorfismo;

public class Preguica extends Animal {
	
	public Preguica(String nome, int idade){
		super(nome, idade);
	}

	public void subirArvore() {
		System.out.println("subin.....");
	}
	
	@Override
	public void emitirSom() {
		System.out.println("zzzzZZZZZzz");
	}
}
