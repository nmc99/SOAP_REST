/**
 * ServicioPersonaImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package servicios;

public interface ServicioPersonaImpl extends java.rmi.Remote {
    public modelo.Persona getPersona(int id) throws java.rmi.RemoteException;
    public boolean borrarPersona(int id) throws java.rmi.RemoteException;
    public modelo.Persona[] getAllPersonas() throws java.rmi.RemoteException;
    public boolean addPersona(modelo.Persona p) throws java.rmi.RemoteException;
}
