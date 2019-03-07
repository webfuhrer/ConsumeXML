package paqueteconsumexml;

import java.util.ArrayList;

public class ClasePrincipal {

	public static void main(String[] args) {
		ArrayList<Contacto> lista=AccesoFichero.parsearContactos();
		for (Contacto contacto : lista) {
			System.out.println(contacto);
		}
	}

}
