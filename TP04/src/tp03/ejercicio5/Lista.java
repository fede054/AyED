package tp03.ejercicio5;

public abstract class Lista {
	
	protected int tamanio;
	
	abstract public void comenzar();
	abstract public Object proximo();
	abstract public boolean fin();
	abstract public Object elemento(int pos);
	abstract public boolean agregarEn(Object elem, int pos);
	abstract public boolean agregarInicio(Object elem);
	abstract public boolean agregarFinal(Object elem);
	abstract public boolean eliminar(Object elem);
	abstract public boolean eliminar(int pos);
	abstract public boolean esVacia();
	abstract public boolean incluye(Object elem);
	abstract public int tamanio();
}
