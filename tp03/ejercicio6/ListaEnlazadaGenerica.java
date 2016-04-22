package tp03.ejercicio6;

import tp03.ejercicio1.ListaDeEnterosEnlazada;
import tp03.ejercicio1.NodoEntero;

public class ListaEnlazadaGenerica<T> extends ListaGenerica<T> {

	private NodoGenerico<T> inicio;
	private NodoGenerico<T> actual;
	private NodoGenerico<T> fin;


	@Override
	public void comenzar() {
		actual = inicio;
	}

	@Override
	public int tamanio() {
		return this.tamanio;
	}
	
	@Override
	public T proximo() {
		T elto = actual.getDato();
		actual = actual.getSiguiente();
		return elto;
	}

	@Override
	public boolean fin() {
		return (actual == null);
	}

	@Override
	public T elemento(int pos) {
		if (pos < 1 || pos > this.tamanio())
			return null;
		this.comenzar();
		return this.recorrer(1, pos+1);
	}
	
	private T recorrer(int dsd, int dest) { //devuelve el dato de la posición dest-1
		T dato = null;
		if ( !this.fin()) {
			if (dsd == dest-1)
				dato = this.actual.getDato();
			else {
				this.actual = this.actual.getSiguiente();
				dato = this.recorrer(++dsd, dest);
			}
		}
		return dato; 
	}
	
	private boolean insertar (NodoGenerico<T> ant, int pos, T dato) {
		boolean ok = false;
		if (pos < 1 || pos > tamanio+1)
			return ok;
		ListaEnlazadaGenerica<T> n = this;
		NodoGenerico<T> aux = new NodoGenerico<T>();
		aux.setDato(dato);
		if (pos == 1) {
			if (ant == null) {
				aux.setSiguiente(n.inicio);
				n.inicio = aux;
			} else {
				aux.setSiguiente(ant.getSiguiente());
				ant.setSiguiente(aux);
			}
			this.tamanio++;
			ok = true;
		} else {
			ant = n.actual;
			n.actual = n.actual.getSiguiente();
			ok = n.insertar(ant, --pos, dato);
		}
		this.inicio = n.inicio;
		return ok;
	}

	@Override
	public boolean agregarEn(int pos, T dato) {
		if (pos < 1 || pos > this.tamanio() + 1)
			return false;
		this.comenzar();
		NodoGenerico<T> ant = null;
		return this.insertar(ant, pos, dato);	
	}

	private boolean esta(T dato) {
		boolean ok = false;
		if ( !this.fin() ) {
			if (actual.getDato().equals(dato))
				ok = true;
			else {
				actual = actual.getSiguiente();
				ok = esta(dato);
			}
		}
		return ok;
	}
	
	@Override
	public boolean incluye(T dato) {
		this.comenzar();
		return this.esta(dato);
	}
	
	@Override
	public boolean agregarInicio(T dato) {
		return this.agregarEn(1, dato);
	}

	@Override
	public boolean agregarFinal(T dato) {
		return this.agregarEn(this.tamanio+1, dato);
	}
	
	
	private boolean borrar(NodoGenerico<T> ant, T dato) {
		boolean ok = false;
		ListaEnlazadaGenerica<T> n = this;
		if ( !n.fin() ) {
			if (n.actual.getDato().equals(dato)) { //si es el dato buscado
				if (ant == this.inicio) //si el anterior es el inicio es el segundo nodo. 
					n.inicio.setSiguiente(n.actual.getSiguiente());
				else //si es inicio entonces...
					if (ant == null) //si el anterior es null es que es el primer nodo.
						n.inicio = n.actual.getSiguiente();
					else //si el anterior no es null es que es un nodo del medio.
						ant.setSiguiente(n.actual.getSiguiente());
				n.tamanio--;
				ok = true;
			} else {
				ant = n.actual;
				n.actual = n.actual.getSiguiente();
				ok = n.borrar(ant, dato);
			}
		}
		this.inicio = n.inicio;
		return ok;
	}

	@Override
	public boolean eliminar(T dato) {
		this.comenzar();
		NodoGenerico<T> ant = null;//this.actual;
		return this.borrar(ant, dato);
	}

	private boolean borrarEn(NodoGenerico<T> ant, int pos) {
		boolean ok = false;
		if (pos < 1 || pos > this.tamanio())
			return ok;
		if (pos == 1)
			ok = this.borrar(ant, this.actual.getDato());
		else {
			ant = this.actual;
			this.actual = this.actual.getSiguiente();
			ok = this.borrarEn(ant, --pos);
		}
		return ok;
	}
	
	@Override
	public boolean eliminarEn(int pos) {
		this.comenzar();
		NodoGenerico<T> ant = null;
		return this.borrarEn(ant, pos);
	}

	@Override
	public String toString() {
		String str = "";
		NodoGenerico<T> n = this.inicio;
		while (n != null) {
			str = str + n.getDato() + " -> ";
			n = n.getSiguiente();
		}
		if (str.length() > 1)
			str = str.substring(0, str.length() - 4);
		return str;
	}


	@Override
	public boolean esVacia() {
		return (inicio == null);
	}
	
	public ListaGenerica<T> clonar () {
		ListaEnlazadaGenerica<T> clon = new ListaEnlazadaGenerica<T>();
		this.comenzar();
		for (int i=1; i <= this.tamanio; i++){
			clon.agregarEn(i, this.elemento(i));
			this.actual = this.actual.getSiguiente();
		}
		this.comenzar();
		clon.comenzar();
		return clon;
	}
	
	@Override
	public boolean agregarTodos(ListaGenerica<T> lista) {
		boolean ok=false;
		if ( !lista.esVacia() ) {
			T n = lista.proximo();
			lista.eliminar(n);
			this.agregarFinal(n);
			this.agregarTodos(lista);
			ok = true;
		}
		return ok;
	}
	
	@Override
	public void limpiar() {
		this.inicio = null;
		this.actual = null;
		this.fin = null;
	}
	
	@Override
	public boolean reemplazarEn(T dato, int pos) {
		boolean ok=false;
		if ( pos >= 0 ) {
			this.agregarEn(pos, dato);
			this.eliminarEn(pos+1);
			ok=true;
		}
		return ok;
	}
}
	

