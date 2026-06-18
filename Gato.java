package petshop;

class Gato extends Animal {
		private boolean arranhaMoveis;
		    Gato(String nome, int idade, boolean faminto, String dono, String telefone, boolean arranhaMoveis) {
		        super(nome, idade, faminto, dono, telefone);
		        this.arranhaMoveis = arranhaMoveis;

		    }

		    @Override
		    public void emitirSom() {
		        System.out.println("Miau!");
			}

		   public boolean isArranhaMoveis() {
		        return arranhaMoveis;
		    }

		    public void setarranhaMoveis(boolean arranhaMoveis) {
		        this.arranhaMoveis = arranhaMoveis;
		    }
		}

