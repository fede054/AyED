package tp03.ejercicio4;

import tp03.ejercicio1.*;

public class CribaDeEratostenes {

	public ListaDeEnterosEnlazada obtenerPrimos1 (ListaDeEnterosEnlazada l) {
		ListaDeEnterosEnlazada lprim= l.clonar();
		int aux2=lprim.tamanio();
		double aux=Math.sqrt(aux2);
		for (int i=2; i<=aux; i++) {
			if ( !(lprim.proximo() == (i)) )
				for(int j=i; j<=aux2/i; j++)
					lprim.eliminar(i*j);
			lprim.comenzar();
		}
		lprim.eliminarEn(1);
		return lprim;
	}
	
	public ListaDeEnterosEnlazada obtenerPrimos2 (ListaDeEnterosEnlazada l) {
		ListaDeEnterosEnlazada lprim=l.clonar(); 
		double fin = Math.sqrt(lprim.tamanio());
		for (int j=2; j<fin; j++) {
			while ( !lprim.fin()) {
				int dato=lprim.proximo();
				if ( !( dato == j ) )
					if ( (dato % j)==0 )
						lprim.eliminar(dato);
			}
			lprim.comenzar();
		}
		lprim.eliminarEn(1);
		return lprim;
	}
	
}
