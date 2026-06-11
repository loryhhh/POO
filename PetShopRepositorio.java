package petshop;

import java.util.ArrayList;
import java.util.List;

public class PetShopRepositorio {

	private final ArrayList<Animal> animais = new ArrayList<>();

	public void adicionar(Animal a) {
		animais.add(a);
	}

	
	public Animal buscarPorNome(String nome) {
		System.out.println(animais.contains(nome));
		return null;
	}

	
	public boolean remover(String nome) {
		System.out.println(animais.contains(nome));
		System.out.println(animais.remove(nome));
		return true;
	}

	
	public ArrayList<Animal> listarTodos() {
		return animais;
	}

	
	public int quantidade() {
		System.out.println(animais.size());
		return 0;
	}
}
