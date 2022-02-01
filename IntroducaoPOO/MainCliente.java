package IntroducaoPOO;

public class MainCliente {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		Cliente c2= new Cliente();
		Cliente c3 = new Cliente();
		cliente.setNome("Paulo");
		cliente.setIdade(18);

		cliente.compraBala();
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(cliente);
		System.out.println(c3);
	}

}
