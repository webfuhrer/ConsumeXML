package paqueteconsumexml;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

public class AccesoFichero {

	public static ArrayList<Contacto> parsearContactos() {
		// TODO Auto-generated method stub
		SAXBuilder builder=new SAXBuilder();
		ArrayList<Contacto> lista=new ArrayList<>();
		try {
			Document doc=builder.build(new File("D:\\agenda.xml"));
			Element elemento_agenda=doc.getRootElement();
			List<Element> lista_contactos=elemento_agenda.getChildren("contacto");
			for (Element element : lista_contactos) {
				String nombre=element.getChild("nombre").getValue();
				Element elemento_apellido=element.getChild("apellido");
				Element elemento_email=element.getChild("email");
				//String nombre=elemento_nombre.getValue();
				String apellido=elemento_apellido.getValue();
				String email=elemento_email.getValue();
				Contacto c=new Contacto(nombre, email, apellido, 99);
				lista.add(c);
			}
		} catch (JDOMException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lista;
	}

}
