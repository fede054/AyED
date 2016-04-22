package tp03.ejercicio6;

public abstract class ListaGenerica<T> {

	protected int tamanio;
	
	public abstract void comenzar();
	public abstract T proximo();
	public abstract boolean fin();
	public abstract T elemento(int pos);
	public abstract boolean agregarEn(int pos, T elem);
	public abstract boolean agregarInicio(T dato);
	public abstract boolean agregarFinal(T dato);
	public abstract boolean eliminar(T dato);
	public abstract boolean eliminarEn(int pos);
	public abstract boolean esVacia();
	public abstract boolean incluye(T dato);
	public abstract int tamanio();
	public abstract boolean reemplazarEn(T dato, int pos);
	public abstract boolean agregarTodos(ListaGenerica<T> lista);
	public abstract ListaGenerica<T> clonar();
	public abstract void limpiar();
	
}
