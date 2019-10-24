package servicios;

public class ServicioPersonaImplProxy implements servicios.ServicioPersonaImpl {
  private String _endpoint = null;
  private servicios.ServicioPersonaImpl servicioPersonaImpl = null;
  
  public ServicioPersonaImplProxy() {
    _initServicioPersonaImplProxy();
  }
  
  public ServicioPersonaImplProxy(String endpoint) {
    _endpoint = endpoint;
    _initServicioPersonaImplProxy();
  }
  
  private void _initServicioPersonaImplProxy() {
    try {
      servicioPersonaImpl = (new servicios.ServicioPersonaImplServiceLocator()).getServicioPersonaImpl();
      if (servicioPersonaImpl != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)servicioPersonaImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)servicioPersonaImpl)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (servicioPersonaImpl != null)
      ((javax.xml.rpc.Stub)servicioPersonaImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public servicios.ServicioPersonaImpl getServicioPersonaImpl() {
    if (servicioPersonaImpl == null)
      _initServicioPersonaImplProxy();
    return servicioPersonaImpl;
  }
  
  public modelo.Persona getPersona(int id) throws java.rmi.RemoteException{
    if (servicioPersonaImpl == null)
      _initServicioPersonaImplProxy();
    return servicioPersonaImpl.getPersona(id);
  }
  
  public boolean borrarPersona(int id) throws java.rmi.RemoteException{
    if (servicioPersonaImpl == null)
      _initServicioPersonaImplProxy();
    return servicioPersonaImpl.borrarPersona(id);
  }
  
  public modelo.Persona[] getAllPersonas() throws java.rmi.RemoteException{
    if (servicioPersonaImpl == null)
      _initServicioPersonaImplProxy();
    return servicioPersonaImpl.getAllPersonas();
  }
  
  public boolean addPersona(modelo.Persona p) throws java.rmi.RemoteException{
    if (servicioPersonaImpl == null)
      _initServicioPersonaImplProxy();
    return servicioPersonaImpl.addPersona(p);
  }
  
  
}