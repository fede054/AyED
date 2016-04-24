package tp03.ejercicio5;

public class ListaEnlazada extends Lista {
	private Nodo inicio;
	private Nodo actual;
	private Nodo fin;

	private int tamanio;

	public void comenzar() {
		actual = inicio;
	}

	public Object proximo() {
		Object elto = actual.getDato();
		actual = actual.getSiguiente();
		return elto;
	}

	public boolean fin() {
		return (actual == null);
	}

	public Object elemento(int pos) {
		if (pos < 1 || pos > this.tamanio())
			return null;
		Nodo n = this.inicio;
		while (pos-- > 1)
			n = n.getSiguiente();
		return n.getDato();
	}

	public boolean agregarEn(Object elem, int pos) {
		if (pos < 1 || pos > this.tamanio() + 1)
			return false;
		this.tamanio++;
		Nodo aux = new Nodo();
		aux.setDato(elem);
		if (pos == 1) {
			aux.setSiguiente(inicio);
			inicio = aux;
		} else {
			Nodo n = this.inicio;
			Nodo ant = null;
			int posActual = 1;
			while (!(n == null) && (posActual < pos)) {
				ant = n;
				n = n.getSiguiente();
				posActual++;
			}
			aux.setSiguiente(n);
			ant.setSiguiente(aux);
			//Nuevo
			if (aux.getSiguiente()==null)
				fin=aux;
		}
		return true;
	}

	public boolean agregarInicio(Object elem) {
		this.agregarEn(elem, 1);
		return true;
	}

	public boolean agregarFinal(Object elem) {
		Nodo aux = new Nodo();
		aux.setDato(elem);
		if (inicio == null) {
			inicio = aux;
			fin = aux;
		} else {
			fin.setSiguiente(aux);
			fin = aux;
		}
		tamanio++;
		return true;
	}

	public boolean eliminar(Object elem) {
		Nodo n = this.inicio;
		Nodo ant = null;
		while ((n != null) && (!n.getDato().equals(elem))) {
			ant = n;
			n = n.getSiguiente();
		}
		if (n == null)
			return false;
		else {
			if (ant == null)
				inicio = null;
			else
				ant.setSiguiente(n.getSiguiente());
			this.tamanio--;
			//Nuevo
			if (ant.getSiguiente()==null)
				fin=ant;
			
			return true;
		}
	}

	public boolean eliminar(int pos) {
		if (pos < 1 || pos > this.tamanio())
			return false;
		this.tamanio--;
		if (pos == 1) {
			inicio = inicio.getSiguiente();
			return true;
		}
		Nodo n = this.inicio;
		Nodo ant = null;
		while (!(n == null) && (pos > 1)) {
			pos--;
			ant = n;
			n = n.getSiguiente();
		}
		ant.setSiguiente(n.getSiguiente());
		//Nuevo
		if (ant.getSiguiente()==null)
			fin=ant;
		return true;
	}

	public boolean incluye(Object elem) {
		Nodo n = this.inicio;
		while (!(n == null) && !(n.getDato().equals(elem)))
			n = n.getSiguiente();
		return !(n == null);
	}

	public String toString() {
		String str = "";
		Nodo n = this.inicio;
		while (n != null) {
			str = str + n.getDato() + " -> ";
			n = n.getSiguiente();
		}
		if (str.length() > 1)
			str = str.substring(0, str.length() - 4);
		return str;
	}

	public int tamanio() {
		return this.tamanio;
	}

	public boolean esVacia() {
		return (inicio == null);
	}
	
}
