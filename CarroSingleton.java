package CarroCompartilhado;

import java.util.HashSet;
import java.util.Set;

public class CarroSingleton {
	private static final CarroSingleton INSTANCE = new CarroSingleton();
	private Set<String> lugaresDisponiveis;

	private CarroSingleton() {
		this.lugaresDisponiveis = new HashSet<>();
		lugaresDisponiveis.add("FC"); // Frente Carona
		lugaresDisponiveis.add("TE"); // Traseiro Esquerdo
		lugaresDisponiveis.add("TD"); // Traseiro Direito
	}

	public boolean reservarlugar(String lugar) {
		return lugaresDisponiveis.remove(lugar);

	}

	public static CarroSingleton getInstance() {
		return INSTANCE;
	}
 
}
