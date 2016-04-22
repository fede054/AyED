package tp03.ejercicio5;

public class SmartPhone extends Mobile {

	private int numero;

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	@Override
	public boolean equals (Object O) {
		boolean ok=false;
		if ( (O != null) && (O instanceof SmartPhone) ) {
			SmartPhone s = (SmartPhone) O;
			if ((this.getCosto() == s.getCosto()) && 
				(this.getMarca() == s.getMarca()) && 
				(this.getModelo() == s.getModelo()) && 
				(this.getSistemaOperativo() == s.getSistemaOperativo()) &&
				(this.getNumero() == s.getNumero()))
				ok = true;
		}
		return ok;
	}
	
	@Override
	public String toString () {
		return ("Costo: " + this.getCosto() + ", Marca: " + this.getMarca() + ", Modelo: " + this.getModelo() + ", Sistema Operativo: " + this.getSistemaOperativo() + ", Número: " + this.getNumero());
	}
	
}
