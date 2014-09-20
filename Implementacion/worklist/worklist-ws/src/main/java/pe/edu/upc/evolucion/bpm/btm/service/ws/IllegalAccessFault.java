
package pe.edu.upc.evolucion.bpm.btm.service.ws;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.0.1
 * 2014-09-20T17:44:05.682-05:00
 * Generated source version: 3.0.1
 */

@WebFault(name = "illegalAccess", targetNamespace = "http://docs.oasis-open.org/ns/bpel4people/ws-humantask/api/200803")
public class IllegalAccessFault extends Exception {
    
    private java.lang.String illegalAccess;

    public IllegalAccessFault() {
        super();
    }
    
    public IllegalAccessFault(String message) {
        super(message);
    }
    
    public IllegalAccessFault(String message, Throwable cause) {
        super(message, cause);
    }

    public IllegalAccessFault(String message, java.lang.String illegalAccess) {
        super(message);
        this.illegalAccess = illegalAccess;
    }

    public IllegalAccessFault(String message, java.lang.String illegalAccess, Throwable cause) {
        super(message, cause);
        this.illegalAccess = illegalAccess;
    }

    public java.lang.String getFaultInfo() {
        return this.illegalAccess;
    }
}
