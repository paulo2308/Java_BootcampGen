package heranca;

public class TestaAnimal {

	public static void main(String[] args) {
		Cachorro cachorro = new Cachorro("wold", 1, 4);
		Cavalo cavalo = new Cavalo("Pé de pano", 75);
		Preguica preguica = new Preguica("zezé", 4);
		
		cachorro.setBebeuAgua(true);
		cachorro.correr();
		cachorro.emitirSom();
		cavalo.trotar();
		cavalo.emitirSom();
		preguica.subirArvore();
		preguica.emitirSom();

	}

}
