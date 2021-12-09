/*
 * WSIFaction.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 9.11.2021 14:30
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
public interface WSIFaction {
    
    @WebMethod String getFactions();

    @WebMethod String search(String json);

    @WebMethod String getFaction(String json);

    @WebMethod void insertFaction(String json);

    @WebMethod void updateFaction(String json);

    @WebMethod void deleteFaction(String json);

    @WebMethod String getFactions4system(String json);

    @WebMethod void delete4system(String json);


}

