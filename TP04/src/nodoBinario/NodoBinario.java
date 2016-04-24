package nodoBinario;

public class NodoBinario {

	private Object dato;
	private NodoBinario hijoIzquierdo;
	private NodoBinario hijoDerecho;
	
	public NodoBinario(Object dato){		
		this.dato = dato;
		this.hijoIzquierdo = null;
		this.hijoDerecho = null;
	}
	
	public Object getDato(){		
		return this.dato; 
	}
	
	public NodoBinario getHijoIzquierdo(){		
		return this.hijoIzquierdo;
	}
	
	public NodoBinario getHijoDerecho(){		
		return this.hijoDerecho;
	}	
	
	public void setDato(Object dato){		
		this.dato = dato;
	}
	
	public void setHijoIzquierdo(NodoBinario hijoIzq){		
		this.hijoIzquierdo = hijoIzq;
	}
	
	public void setHijoDerecho(NodoBinario hijoDer){		
		this.hijoDerecho = hijoDer;
	}	
}
