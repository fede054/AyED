package tp03.ejercicio5;

public class Tablet extends Mobile {

	private int pulgadas;
	
	public int getPulgadas() {
		return pulgadas;
	}

	public void setPulgadas(int pulgadas) {
		this.pulgadas = pulgadas;
	}

	@Override
	public boolean equals (Object O) {
		boolean ok=false;
		if ( (O != null) && (O instanceof Tablet) ) {
			Tablet t = (Tablet) O;
			if ((this.getCosto() == t.getCosto()) && 
				(this.getMarca() == t.getMarca()) && 
				(this.getModelo() == t.getModelo()) && 
				(this.getSistemaOperativo() == t.getSistemaOperativo()) &&
				(this.getPulgadas() == t.getPulgadas()))
				ok = true;
		}
		return ok;
	}
	
	@Override
	public String toString () {
		return ("Costo: " + this.getCosto() + ", Marca: " + this.getMarca() + ", Modelo: " + this.getModelo() + ", Sistema Operativo: " + this.getSistemaOperativo() + ", Pulgadas: " + this.getPulgadas());
	}
	
}
