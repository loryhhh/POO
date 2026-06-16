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

	@Override
	protected String getRaca() {
		return raca;
	}
}
