package one.digitalinnovation.gof.singleton;

/**
 * Singleton "Lazy Holder"
 * 
 * @author marcelo
 */

public class SingletonLazyHolder {
	
	private static class InstanceHolder {
		private static SingletonLazyHolder instancia = new SingletonLazyHolder();
	}
	
	
	
	private SingletonLazyHolder() {
		super();
	}
	
	public static SingletonLazyHolder getInstacia() {
		return InstanceHolder.instancia;
	}

}
