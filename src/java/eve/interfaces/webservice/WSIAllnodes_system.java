/*
 * WSIAllnodes_system.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 14.0.2022 16:56
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
public interface WSIAllnodes_system {
    
    @WebMethod String getAllnodes_systems();

    @WebMethod String search(String json);

    @WebMethod String getAllnodes_system(String json);

    @WebMethod void insertAllnodes_system(String json);

    @WebMethod void updateAllnodes_system(String json);

    @WebMethod void deleteAllnodes_system(String json);


}

