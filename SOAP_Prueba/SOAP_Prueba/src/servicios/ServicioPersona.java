package servicios;

import modelo.Persona;

public interface ServicioPersona {
public boolean addPersona(Persona p);
	
	public boolean borrarPersona(int id);
	
	public Persona getPersona(int id);
	
	public Persona[] getAllPersonas();
}
