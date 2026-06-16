package petshop;

public abstract class Animal {
	protected String nome = "";
	protected int idade = 0;
	protected boolean faminto;
	public static int totalDeAnimais = 0;
	protected Cliente dono = new Cliente();
	protected String telefone = "";

	public Animal(String nome, int idade, boolean faminto, String dono, String telefone) {
		this.nome = nome;
		this.idade = idade;
		this.faminto = faminto;
		this.dono.setNome(dono);
		this.dono.setTelefone(telefone);
	}

	public Animal() {
		totalDeAnimais = totalDeAnimais++;
	}

	public String getnome() {
		return nome;
	}

	public int getidade() {
		return idade;
	}

	public boolean isfaminto() {
		return faminto;
	}

	public int getTotalDeAnimais() {
		return Animal.totalDeAnimais;
	}

	public void setnome(String nome) {
		this.nome = nome;
	}

	public void setidade(int idade) {
		this.idade = idade;
	}

	public void setfaminto(boolean faminto) {
		this.faminto = faminto;
	}

	public int setTotalDeAnimais() {
		return totalDeAnimais;
	}

	public abstract void emitirSom();

	public String getdono() {
		return dono.getNome();
	}

	public void setdono(String nome) {
		this.dono.setNome(nome);
	}

	public String gettelefone() {
		return dono.getTelefone();
	}

	public void settelefone() {
		this.dono.setTelefone(telefone);
	}

	public String exibirDados() {
		return ("Nome: " + nome +
				"\nIdade: " + idade +
				"\nFaminto: " + faminto +
				"\nDono: " + dono.getNome() +
				"\nTelefone: " + dono.getTelefone() +
				"\nRaça: " + getRaca());
	}

	protected abstract String getRaca();

}
