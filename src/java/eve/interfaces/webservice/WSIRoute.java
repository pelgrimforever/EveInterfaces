/*
 * WSIRoute.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 8.10.2021 7:21
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
public interface WSIRoute {
    
    @WebMethod String getRoutes();

    @WebMethod String search(String json);

    @WebMethod String getRoute(String json);

    @WebMethod void insertRoute(String json);

    @WebMethod void updateRoute(String json);

    @WebMethod void deleteRoute(String json);

    @WebMethod String getRoutes4routetype(String json);

    @WebMethod void delete4routetype(String json);

    @WebMethod String getRoutes4system(String json);

    @WebMethod void delete4system(String json);


}

