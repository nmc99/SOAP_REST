package servicios;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import modelo.Persona;

public class ServicioPersonaImpl implements ServicioPersona{
private static Map<Integer,Persona> personas = new HashMap<Integer,Persona>();
	
	@Override
	public boolean addPersona(Persona p) {
		if(personas.get(p.getId()) != null) return false;
		personas.put(p.getId(), p);
		return true;
	}

	@Override
	public boolean borrarPersona(int id) {
		if(personas.get(id) == null) return false;
		personas.remove(id);
		return true;
	}

	@Override
	public Persona getPersona(int id) {
		return personas.get(id);
	}

	@Override
	public Persona[] getAllPersonas() {
		Set<Integer> ids = personas.keySet();
		Persona[] p = new Persona[ids.size()];
		int i=0;
		for(Integer id : ids){
			p[i] = personas.get(id);
			i++;
		}
		return p;
	}
}
