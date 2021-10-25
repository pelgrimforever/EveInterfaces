/*
 * WSILocation.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 25.9.2021 15:16
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
public interface WSILocation {
    
    @WebMethod String getLocations();

    @WebMethod String search(String json);

    @WebMethod String getLocation(String json);

    @WebMethod void insertLocation(String json);

    @WebMethod void updateLocation(String json);

    @WebMethod void deleteLocation(String json);

    @WebMethod String getLocations4system(String json);

    @WebMethod void delete4system(String json);


}

