package tp03.ejercicio5;

public class TestSobreescritura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SmartPhone m = new SmartPhone();
		SmartPhone n = new SmartPhone();
		
		m.setCosto(10);
		n.setCosto(10);
		m.setMarca("lg");
		n.setMarca("lg");
		m.setModelo("leon");
		n.setModelo("leon");
		m.setSistemaOperativo("Android");
		n.setSistemaOperativo("Android");
		m.setNumero(155223366);
		n.setNumero(158779944);
		
		System.out.println("Son iguales? " + m.equals(n));
		
		System.out.println("Datos de m: " + m.toString());
		System.out.println("Datos de n: " + n.toString());
		
	}

}
