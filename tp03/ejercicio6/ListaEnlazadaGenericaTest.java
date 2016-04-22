package tp03.ejercicio6;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ListaEnlazadaGenericaTest {

	ListaEnlazadaGenerica<Integer> l;
	
	@Before
	public void iniciar() {
		l = new ListaEnlazadaGenerica<Integer>();
	}
	
	@Test
	public void testAgregarEn() {
		//pruebo inicio, en medio y final...
		assertTrue(l.agregarInicio(3));
		assertTrue(l.agregarEn(1, 62));
		assertTrue(l.agregarEn(2, 5));
		assertTrue(l.agregarFinal(254));
		System.out.println(l.toString());
		//pruebo inicio, en medio y final...
		assertTrue(l.agregarEn(3, 20));
		assertTrue(l.agregarInicio(10));
		assertTrue(l.agregarFinal(80));
		System.out.println(l.toString());
		//pruebo inicio, en medio y final...
		assertTrue(l.agregarEn(4, 125964));
		assertTrue(l.agregarEn(3, 45));
		assertTrue(l.agregarInicio(598));
		assertTrue(l.agregarFinal(200));
		System.out.println(l.toString());
	}
	
	@Test
	public void testIncluye() {
		testAgregarEn();
		assertTrue(l.incluye(20));
		assertTrue(l.incluye(45));
		assertTrue(l.incluye(200));
		assertFalse(l.incluye(1000));
		assertFalse(l.incluye(25));
		assertFalse(l.incluye(236));
	}
	
	@Test
	public void testElemento() {
		testAgregarEn();
		//deberían dar iguales...
		assertEquals(new Integer(10), l.elemento(2));
		assertEquals(new Integer(5), l.elemento(5));
		assertEquals(new Integer(125964), l.elemento(6));
		//deberían dar distintos...
		assertNotEquals(new Integer(600), l.elemento(1));
		assertNotEquals(new Integer(605), l.elemento(4));
		assertNotEquals(new Integer(2058), l.elemento(9));
	}
	
	@Test
	public void testEliminar() {
		testAgregarEn();
		assertTrue(l.eliminar(5));
		System.out.println(l.toString());
		assertTrue(l.eliminar(62));
		System.out.println(l.toString());
		assertTrue(l.eliminar(598));
		System.out.println(l.toString());
		assertTrue(l.eliminar(80));
		System.out.println(l.toString());
		assertTrue(l.eliminar(254));
		System.out.println(l.toString());
		assertTrue(l.eliminar(10));
		System.out.println(l.toString());
		assertTrue(l.eliminar(200));
		System.out.println(l.toString());
	}
	
	@Test
	public void testEliminarEn() {
		testAgregarEn();
		assertTrue(l.eliminarEn(2));
		System.out.println(l.toString());
		assertTrue(l.eliminarEn(10));
		System.out.println(l.toString());
		assertTrue(l.eliminarEn(7));
		System.out.println(l.toString());
		assertTrue(l.eliminarEn(3));
		System.out.println(l.toString());
		assertTrue(l.eliminarEn(1));
		System.out.println(l.toString());
		assertTrue(l.eliminarEn(4));
		System.out.println(l.toString());
		assertTrue(l.eliminarEn(5));
		System.out.println(l.toString());
	}
	
	
}
