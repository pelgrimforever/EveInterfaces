/*
 * WSIEveuser.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 11.4.2022 9:13
 *
 */

package eve.interfaces.webservice;

import java.util.ArrayList;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 *
 * @author Franky Laseure
 */
//Service Endpoint Interface
@WebService
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT, use=SOAPBinding.Use.LITERAL)
public interface WSIEveuser {
    
    @WebMethod String getEveusers();

    @WebMethod String search(String json);

    @WebMethod String getEveuser(String json);

    @WebMethod void insertEveuser(String json);

    @WebMethod void updateEveuser(String json);

    @WebMethod void deleteEveuser(String json);

    @WebMethod String getEveusers4frontendpage_auth(String json);


}
