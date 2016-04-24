package testArbolBinario;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import tp03.ejercicio5.Lista;
import tp03.ejercicio5.ListaEnlazada;
import arbolBinario.ArbolBinario;

public class ArbolBinarioTest {
	ArbolBinario arbolBinarioA;
	ArbolBinario arbolBinarioB;
	ArbolBinario arbolBinarioC;
	ArbolBinario arbolBinarioD;
	ArbolBinario arbolBinarioE;
	ArbolBinario arbolBinarioF;
	ArbolBinario arbolBinarioG;
	
	@Before
	public void setUp() throws Exception {
		// ----- arbolBinarioA -----
		arbolBinarioA=new ArbolBinario(1);		
		ArbolBinario hijoIzquierdo=new ArbolBinario(2);
		hijoIzquierdo.agregarHijoIzquierdo(new ArbolBinario(3));
		hijoIzquierdo.agregarHijoDerecho(new ArbolBinario(4));		
		ArbolBinario hijoDerecho=new ArbolBinario(5);
		hijoDerecho.agregarHijoIzquierdo(new ArbolBinario(6));
		hijoDerecho.agregarHijoDerecho(new ArbolBinario(7));
		arbolBinarioA.agregarHijoIzquierdo(hijoIzquierdo);
		arbolBinarioA.agregarHijoDerecho(hijoDerecho);

		// ----- arbolBinarioB -----
		arbolBinarioB=new ArbolBinario(1);		
		ArbolBinario hijoIzquierdoB=new ArbolBinario(2);
		hijoIzquierdoB.agregarHijoIzquierdo(new ArbolBinario(3));
		hijoIzquierdoB.agregarHijoDerecho(new ArbolBinario(4));		
		ArbolBinario hijoDerechoB=new ArbolBinario(6);
		hijoDerechoB.agregarHijoIzquierdo(new ArbolBinario(7));
		hijoDerechoB.agregarHijoDerecho(new ArbolBinario(8));		
		arbolBinarioB.agregarHijoIzquierdo(hijoIzquierdoB);
		arbolBinarioB.agregarHijoDerecho(hijoDerechoB);
		
		// ----- arbolBinarioC -----				
		arbolBinarioC=new ArbolBinario(11);		
		ArbolBinario hijoIzquierdoC=new ArbolBinario(12);
		hijoIzquierdoC.agregarHijoIzquierdo(new ArbolBinario(13));
		hijoIzquierdoC.agregarHijoDerecho(new ArbolBinario(14));		
		ArbolBinario hijoDerechoC=new ArbolBinario(15);
		hijoDerechoC.agregarHijoDerecho(new ArbolBinario(8));		
		arbolBinarioC.agregarHijoIzquierdo(hijoIzquierdoC);
		arbolBinarioC.agregarHijoDerecho(hijoDerechoC);
		
		// ----- arbolBinarioD -----				
		arbolBinarioD=new ArbolBinario(11);		
		ArbolBinario hijoIzquierdoD=new ArbolBinario(12);
		hijoIzquierdoD.agregarHijoIzquierdo(new ArbolBinario(13));
		hijoIzquierdoD.agregarHijoDerecho(new ArbolBinario(14));		
		ArbolBinario hijoDerechoD=new ArbolBinario(15);
		hijoDerechoD.agregarHijoIzquierdo(new ArbolBinario(8));		
		arbolBinarioD.agregarHijoIzquierdo(hijoIzquierdoD);
		arbolBinarioD.agregarHijoDerecho(hijoDerechoD);
		
		// ----- arbolBinarioE -----				
		arbolBinarioE=new ArbolBinario(1);		
		ArbolBinario hijoIzquierdoE=new ArbolBinario(2);
		hijoIzquierdoE.agregarHijoIzquierdo(new ArbolBinario(4));
		hijoIzquierdoE.agregarHijoDerecho(new ArbolBinario(5));		
		ArbolBinario hijoDerechoE=new ArbolBinario(3);
		hijoDerechoE.agregarHijoIzquierdo(new ArbolBinario(6));	
		arbolBinarioE.agregarHijoIzquierdo(hijoIzquierdoE);
		arbolBinarioE.agregarHijoDerecho(hijoDerechoE);
		
		// ----- arbolBinarioF -----				
		arbolBinarioF=new ArbolBinario(1);		
		ArbolBinario hijoIzquierdoF=new ArbolBinario(3);
		hijoIzquierdoF.agregarHijoDerecho(new ArbolBinario(6));		
		ArbolBinario hijoDerechoF=new ArbolBinario(2);
		hijoDerechoF.agregarHijoIzquierdo(new ArbolBinario(5));
		hijoDerechoF.agregarHijoDerecho(new ArbolBinario(4));		
		arbolBinarioF.agregarHijoIzquierdo(hijoIzquierdoF);
		arbolBinarioF.agregarHijoDerecho(hijoDerechoF);
		
		// ----- arbolBinarioG -----
		arbolBinarioG=new ArbolBinario();	
	}
	
	@Test
	public void testGetDatoRaiz(){
		assertEquals(new Integer(1),arbolBinarioA.getDatoRaiz());
		assertEquals(new Integer(1),arbolBinarioB.getDatoRaiz());
		assertEquals(new Integer(11),arbolBinarioC.getDatoRaiz());		
		assertEquals(null,arbolBinarioG.getDatoRaiz());
		arbolBinarioG = new ArbolBinario(33);
		assertEquals(new Integer(33),arbolBinarioG.getDatoRaiz());
	}
	
	@Test
	public void testGetHijoIzquierdo(){
		assertEquals(new Integer (2),arbolBinarioA.getHijoIzquierdo().getDatoRaiz());
		
	}
	
	@Test
	public void testGetHijoDerecho(){
		assertEquals(new Integer (5),arbolBinarioA.getHijoDerecho().getDatoRaiz());
	}
	
	@Test
	public void testAgregarHijoIzquierdo(){
		ArbolBinario hijo = new ArbolBinario(25);	
		arbolBinarioG = new ArbolBinario(33);
		arbolBinarioG.agregarHijoIzquierdo(hijo);
		assertEquals(hijo.getDatoRaiz(),arbolBinarioG.getHijoIzquierdo().getDatoRaiz());
	}
	
	@Test
	public void testAgregarHijoDerecho(){
		ArbolBinario hijo = new ArbolBinario(105);	
		arbolBinarioG = new ArbolBinario(33);
		arbolBinarioG.agregarHijoDerecho(hijo);
		assertEquals(hijo.getDatoRaiz(),arbolBinarioG.getHijoDerecho().getDatoRaiz());		
	}
	
	@Test
	public void testEliminarHijoIzquierdo(){
		ArbolBinario hijo = new ArbolBinario(25);	
		arbolBinarioG = new ArbolBinario(33);
		arbolBinarioG.agregarHijoIzquierdo(hijo);
		assertEquals(hijo.getDatoRaiz(),arbolBinarioG.getHijoIzquierdo().getDatoRaiz());
		arbolBinarioG.eliminarHijoIzquierdo();
		assertEquals(null,arbolBinarioG.getHijoIzquierdo().getDatoRaiz());		
	}
	
	@Test
	public void testEliminarHijoDerecho(){
		ArbolBinario hijo = new ArbolBinario(25);	
		arbolBinarioG = new ArbolBinario(33);
		arbolBinarioG.agregarHijoDerecho(hijo);
		assertEquals(hijo.getDatoRaiz(),arbolBinarioG.getHijoDerecho().getDatoRaiz());
		arbolBinarioG.eliminarHijoDerecho();
		assertEquals(null,arbolBinarioG.getHijoDerecho().getDatoRaiz());
	}	
	@Test
	public void testFrontera() {
		
		//CASO arbolBinarioA
		ListaEnlazada listaFronteraEsperada=new ListaEnlazada();
		listaFronteraEsperada.agregarFinal(3);
		listaFronteraEsperada.agregarFinal(4);
		listaFronteraEsperada.agregarFinal(6);
		listaFronteraEsperada.agregarFinal(7);
		
		Lista listaFronteraDeArbolBinario=arbolBinarioA.frontera();
		assertEquals(listaFronteraEsperada.elemento(1), listaFronteraDeArbolBinario.elemento(1));
		assertEquals(listaFronteraEsperada.elemento(2), listaFronteraDeArbolBinario.elemento(2));
		assertEquals(listaFronteraEsperada.elemento(3), listaFronteraDeArbolBinario.elemento(3));
		assertEquals(listaFronteraEsperada.elemento(4), listaFronteraDeArbolBinario.elemento(4));
		
		
		//CASO arbolBinarioC
		listaFronteraEsperada=new ListaEnlazada();
		listaFronteraEsperada.agregarEn(13,1);
		listaFronteraEsperada.agregarEn(14,2);
		listaFronteraEsperada.agregarEn(8,3);
		
		listaFronteraDeArbolBinario=arbolBinarioC.frontera();
		assertEquals(listaFronteraEsperada.elemento(1), listaFronteraDeArbolBinario.elemento(1));
		assertEquals(listaFronteraEsperada.elemento(2), listaFronteraDeArbolBinario.elemento(2));
		assertEquals(listaFronteraEsperada.elemento(3), listaFronteraDeArbolBinario.elemento(3));
	}

	/*
	@Test
	public void testEsMenor() {
		assertTrue(arbolBinarioA.esMenor(arbolBinarioB));
	}	
	*/
	
	@Test
	public void testLleno() {
		assertTrue(arbolBinarioA.lleno());
		assertFalse(arbolBinarioD.lleno());
	}
	

	@Test
	public void testCompleto() {
		assertTrue(arbolBinarioA.completo());
		assertFalse(arbolBinarioC.completo());
		assertTrue(arbolBinarioD.completo());
	}


	

	
}
