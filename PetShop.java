public class PetShop {
    public static void main(String[] args) {

        Animal[] filaAtendimento = new Animal[2];

        filaAtendimento[0] =
                new Cachorro("Rex", 5, "Labrador", true, "João");

        filaAtendimento[1] =
                new Gato("Mia", 3, false, "Maria", true);

        for (int i = 0; i < filaAtendimento.length; i++) {

            System.out.println("Animal " + (i + 1) + ":");

            filaAtendimento[i].emitirSom();

            System.out.println("Nome: " + filaAtendimento[i].getidade());
            System.out.println("Raça: " + filaAtendimento[i].getraca());
            System.out.println("Idade: " + filaAtendimento[i].getnome());
            System.out.println("Faminto: " + filaAtendimento[i].isfaminto());
            System.out.println("O dono do pet é: " + filaAtendimento[i].getdono());
            Animal.totalDeAnimais = Animal.totalDeAnimais + 1;
			System.out.println("Total de animais no pet shop: "+ + Animal.totalDeAnimais);
        }
    }
}