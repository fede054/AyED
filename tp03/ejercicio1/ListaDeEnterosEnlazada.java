package tp03.ejercicio1;

public class ListaDeEnterosEnlazada extends ListaDeEnteros {
	private NodoEntero inicio;
	private NodoEntero actual;
	private NodoEntero fin;

	private int tamanio;

	@Override
	public void comenzar() {
		actual = inicio;
	}

	@Override
	public int tamanio() {
		return this.tamanio;
	}
	
	@Override
	public Integer proximo() {
		Integer elto = actual.getDato();
		actual = actual.getSiguiente();
		return elto;
	}

	@Override
	public boolean fin() {
		return (actual == null);
	}

	@Override
	public Integer elemento(int pos) {
		if (pos < 1 || pos > this.tamanio())
			return null;
		NodoEntero n = this.inicio;
		while (pos-- > 1)
			n = n.getSiguiente();
		return n.getDato();
	}

	@Override
	public boolean agregarEn(Integer elem, int pos) {
		if (pos < 1 || pos > this.tamanio() + 1)
			return false;
		this.tamanio++;
		NodoEntero aux = new NodoEntero();
		aux.setDato(elem);
		if (pos == 1) {
			aux.setSiguiente(inicio);
			inicio = aux;
		} else {
			NodoEntero n = this.inicio;
			NodoEntero ant = null;
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

	@Override
	public boolean incluye(Integer elem) {
		boolean ok = false;
		this.actual = this.inicio; // Está mal! si no pongo esta asignación el método no recorre la lista completa.
		while ( !this.fin() && !this.actual.getDato().equals(elem) )
			this.actual = this.actual.getSiguiente();
		if ( !this.fin() ) 
			ok = true;
		return ok;
	}
	
	@Override
	public boolean agregarInicio(Integer elem) {
		this.agregarEn(elem, 1);
		return true;
	}

	@Override
	public boolean agregarFinal(Integer elem) {
		if ( this.tamanio == 0 )
			this.agregarEn(elem, this.tamanio+1);
		else
			this.agregarEn(elem, this.tamanio);
		return true;
	}
	

	@Override
	public boolean eliminar(Integer elem) {
		NodoEntero n = this.inicio;
		NodoEntero ant = null;
		while ((n != null) && (!n.getDato().equals(elem))) {
			ant = n;
			n = n.getSiguiente();
		}
		if (n == null)
			return false;
		else {
			if (ant == null)
				if (inicio.getSiguiente() != null)
					inicio = inicio.getSiguiente(); // Está mal! si necesito borrar el 1º elemento pierdo el puntero al siguiente si pongo el inicio en null
				else
					inicio = null;
			else
				ant.setSiguiente(n.getSiguiente());
			this.tamanio--;			
			return true;
		}
	}

	@Override
	public boolean eliminarEn(int pos) {
		if (pos < 1 || pos > this.tamanio())
			return false;
		this.tamanio--;
		if (pos == 1) { 
			inicio = inicio.getSiguiente();
			return true;
		}
		NodoEntero n = this.inicio;
		NodoEntero ant = null;
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

	@Override
	public String toString() {
		String str = "";
		NodoEntero n = this.inicio;
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
	
	public ListaDeEnterosEnlazada ordenar() {
		ListaDeEnterosEnlazada lista=new ListaDeEnterosEnlazada();
		ListaDeEnterosEnlazada clon=this.clonar();
		int tamanio=clon.tamanio;
		int min;
		lista.comenzar();
		clon.comenzar();
		for (int i=1; i<=tamanio; i++) {
			min=999999999;
			while (!clon.fin()) {
				int tmp=clon.actual.getDato();
				if (tmp<min)
					min=tmp;	
				clon.actual=clon.actual.getSiguiente();
			}
			lista.agregarInicio(min);
			clon.eliminar(min);
			clon.comenzar();
		}
		return lista;
	}
	
	public ListaDeEnterosEnlazada clonar () {
		ListaDeEnterosEnlazada clon = new ListaDeEnterosEnlazada();
		this.comenzar();
		for (int i=1; i <= this.tamanio; i++){
			clon.agregarEn(this.elemento(i), i);
			this.actual = this.actual.getSiguiente();
		}
		this.comenzar();
		clon.comenzar();
		return clon;
	}
}
