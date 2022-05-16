/*
 * WSIStargate.java
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
public interface WSIStargate {
    
    @WebMethod String getStargates();

    @WebMethod String search(String json);

    @WebMethod String getStargate(String json);

    @WebMethod void insertStargate(String json);

    @WebMethod void updateStargate(String json);

    @WebMethod void deleteStargate(String json);

    @WebMethod String getStargates4systemSystem(String json);

    @WebMethod void delete4systemSystem(String json);

    @WebMethod String getStargates4systemTo_system(String json);

    @WebMethod void delete4systemTo_system(String json);


}

