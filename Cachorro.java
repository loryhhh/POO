package petshop;

class Cachorro extends Animal implements AtendivelNoEstetica {
    Cachorro(String nome, int idade, String raca, boolean faminto, String dono) {
        super(nome, idade, raca, faminto, dono);
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
}	
