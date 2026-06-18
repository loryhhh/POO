package petshop;

import java.util.ArrayList;
import java.util.List;

public class PetShopRepositorio {

	private final ArrayList<Animal> animais = new ArrayList<>();

	public void adicionar(Animal a) {
		animais.add(a);
	}

	public Animal buscarPorNome(String nome) {
		for (Animal a : animais) {
			if (a.nome.equalsIgnoreCase(nome)) {
				return a;
			}

		}
		return null;
	}

	public boolean remover(String nome) {
		for (Animal a : animais) {
			if (a.nome.contains(nome)) {
				animais.remove(a);
				return true;

			}
		}
		return false;
	}

	public ArrayList<Animal> listarTodos() {
		return animais;
	}

	public int quantidade() {
		System.out.println(animais.size());
		return 0;
	}
}
