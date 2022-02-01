package IntroducaoPOO;

public class TesteAviao {

	public static void main(String[] args) {
		Aviao dumont = new Aviao("14-Bis", "branco");
		System.out.print("\t\tPosto de abastecimento: \n\nPara abastecer digite (1), para sair digite (0): ");

		dumont.abastecimento();
		dumont.voar();
		System.out.print("Existe aeroporto para aterrisagem?\n\nDigite (1) para sim e (0) para não: ");
		dumont.aeroporto();
		dumont.pousar();
	}

}
