package modelo;

import javax.xml.bind.annotation.XmlElement;

import org.json.JSONException;
import org.json.JSONObject;

public class Usuario {
	 @XmlElement(name = "nombreusuario")
     String nombreusuario;
	 
     public Usuario() {
	}
	public Usuario(String nombreusuario) {
             this.nombreusuario = nombreusuario;
     }
     @Override
     public String toString() {
             try {
                     return new JSONObject().put("nombreusuario", nombreusuario).toString();
             } catch (JSONException e) {
                     return null;
             }
     }
}
