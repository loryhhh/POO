	class Cachorro extends Animal {
	    Cachorro(String nome, int idade, String raca, boolean faminto, String dono) {
	        super(nome, idade, raca, faminto, dono);
	    }

	    @Override
	    public void emitirSom() {
	        System.out.println("Au au!");
	    }
	}

