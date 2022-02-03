package polimorfismo;

public class Principal {
	public static void main(String[] args) {
		Cachorro cachorro = new Cachorro("wold", 2);
		Cavalo cavalo = new Cavalo("Pé de pano", 75);
		Preguica preguica = new Preguica("zezé", 30);
		
		System.out.println(cachorro.getNome());
		cachorro.emitirSom();
		cachorro.correr();
		System.out.println("------------------------------");
		System.out.println(cavalo.getNome());
		cavalo.emitirSom();
		cavalo.correr();
		System.out.println("------------------------------");
		System.out.println(preguica.getNome());
		preguica.emitirSom();
		preguica.subirArvore();;
	}
}
