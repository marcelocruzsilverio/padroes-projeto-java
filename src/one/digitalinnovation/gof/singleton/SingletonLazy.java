package one.digitalinnovation.gof.singleton;

/**
 * Singleton "preguiçoso"
 * 
 * @author marcelo
 */

public class SingletonLazy {
	
	private static SingletonLazy instancia;
	
	private SingletonLazy() {
		super();
	}
	
	public static SingletonLazy getInstacia() {
		if (instancia == null) {
			instancia = new SingletonLazy();
		}
		return instancia;
	}

}
