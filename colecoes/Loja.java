package colecoes;

public class Loja {

	public static void main(String[] args) {
		Estoque roupas = new Estoque();
		
		roupas.getProdutos().add("camiseta");
		roupas.getProdutos().add("blusa");
		roupas.getProdutos().add("calça");
		roupas.getProdutos().add("jaqueta");
		
		roupas.imprime();
		System.out.println("----------------");
		roupas.getProdutos().remove(2);
		roupas.imprime();
		System.out.println("----------------");
		roupas.getProdutos().add(2, "bermuda");
		roupas.imprime();
	}

}
