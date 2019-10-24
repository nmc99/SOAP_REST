package servicio;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.json.JSONException;

import modelo.Usuario;

public class ServicioUsuarios {
	@SuppressWarnings("unused")
	private static final long serialVersionUID = 1L;
    @GET
    @Produces("application/json")
    public Response getUsers() throws JSONException {
            List<Usuario> usuarios= new ArrayList<>();
            usuarios.add(new Usuario("admin"));
            usuarios.add(new Usuario("john"));
            usuarios.add(new Usuario("usuario2"));
            return Response.status(200).entity(usuarios.toString()).build();
    }
}
