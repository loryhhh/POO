package petshop;

class Cachorro extends Animal implements AtendivelNoEstetica {
	private String raca;

	Cachorro(String nome, int idade, boolean faminto, String dono, String telefone, String raca) {
		super(nome, idade, faminto, dono, telefone);
		this.raca = raca;
	}

	@Override
	public void emitirSom() {
		System.out.println("Au au!");
	}

	@Override
	public void darBanho() {
		// TODO Auto-generated method stub

	}

	@Override
	public void cortarUnhas() {
		// TODO Auto-generated method stub

	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}
	@Override
	public String exibirDados() {
		return ("Nome: " + nome + "\nIdade: " + idade + "\nFaminto: " + faminto + "\nDono: " + dono.getNome()
		+ "\nTelefone: " + dono.getTelefone() + "\nRaça: " + raca);
		
	}
}
