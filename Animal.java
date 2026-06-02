
	public class Animal {
		protected String nome="";
		protected String raca="";
		protected int idade = 0;
		protected boolean faminto;
		public static int totalDeAnimais = 0;
		protected Cliente dono = new Cliente();
		public Animal(String nome, int idade, String raca, boolean faminto, String dono) {
		    this.nome = nome;
		    this.idade = idade;
		    this.raca = raca;
		    this.faminto = faminto;
		    this.dono.setNome(dono);
		}

		public Animal(String nome, int idade, boolean faminto, String dono) {
		    this.nome = nome;
		    this.idade = idade;
		    this.faminto = faminto;
		    this.dono.setNome(dono);
		}
		   


		public Animal(){
		    totalDeAnimais = totalDeAnimais ++;
		}


		public String getnome() {
		    return nome;
		}
		public String getraca() {
		    return raca;
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
		public void setraca(String raca) {
		    this.raca = raca; 
		}
		public int setTotalDeAnimais() {
			return totalDeAnimais;
		}


		    public void emitirSom() {
		        System.out.println("O animal emite um som.");
		    }

		    public String getdono() {
		        return dono.getNome();
		    }
		    public void setdono(String nome) {
		        this.dono.setNome(nome);
		    }

		}

