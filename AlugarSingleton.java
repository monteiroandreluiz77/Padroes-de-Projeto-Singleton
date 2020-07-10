package CarroCompartilhado;

public class AlugarSingleton {
	public static void main(String[] args) {
		reservarBanco("FC");
		reservarBanco("TD");
		reservarBanco("FC");

	}

	private static void reservarBanco(String banco) {
		CarroSingleton c = CarroSingleton.getInstance();
		System.out.println(c.reservarlugar(banco));
	}
}
