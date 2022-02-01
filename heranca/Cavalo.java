package heranca;

public class Cavalo extends Animal{
	
	public Cavalo(String nome, int idade) {
		super(nome, idade);
	}
	
	public void trotar() {
		System.out.println("cavalo trotando");
	}
	

}
