/**
 * ServicioPersonaImplServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package servicios;

public class ServicioPersonaImplServiceLocator extends org.apache.axis.client.Service implements servicios.ServicioPersonaImplService {

    public ServicioPersonaImplServiceLocator() {
    }


    public ServicioPersonaImplServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ServicioPersonaImplServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ServicioPersonaImpl
    private java.lang.String ServicioPersonaImpl_address = "http://localhost:8080/SOAP_Prueba/services/ServicioPersonaImpl";

    public java.lang.String getServicioPersonaImplAddress() {
        return ServicioPersonaImpl_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ServicioPersonaImplWSDDServiceName = "ServicioPersonaImpl";

    public java.lang.String getServicioPersonaImplWSDDServiceName() {
        return ServicioPersonaImplWSDDServiceName;
    }

    public void setServicioPersonaImplWSDDServiceName(java.lang.String name) {
        ServicioPersonaImplWSDDServiceName = name;
    }

    public servicios.ServicioPersonaImpl getServicioPersonaImpl() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ServicioPersonaImpl_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getServicioPersonaImpl(endpoint);
    }

    public servicios.ServicioPersonaImpl getServicioPersonaImpl(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            servicios.ServicioPersonaImplSoapBindingStub _stub = new servicios.ServicioPersonaImplSoapBindingStub(portAddress, this);
            _stub.setPortName(getServicioPersonaImplWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setServicioPersonaImplEndpointAddress(java.lang.String address) {
        ServicioPersonaImpl_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (servicios.ServicioPersonaImpl.class.isAssignableFrom(serviceEndpointInterface)) {
                servicios.ServicioPersonaImplSoapBindingStub _stub = new servicios.ServicioPersonaImplSoapBindingStub(new java.net.URL(ServicioPersonaImpl_address), this);
                _stub.setPortName(getServicioPersonaImplWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("ServicioPersonaImpl".equals(inputPortName)) {
            return getServicioPersonaImpl();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://servicios", "ServicioPersonaImplService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://servicios", "ServicioPersonaImpl"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ServicioPersonaImpl".equals(portName)) {
            setServicioPersonaImplEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
