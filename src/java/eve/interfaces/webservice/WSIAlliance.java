/*
 * WSIAlliance.java
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
public interface WSIAlliance {
    
    @WebMethod String getAlliances();

    @WebMethod String search(String json);

    @WebMethod String getAlliance(String json);

    @WebMethod void insertAlliance(String json);

    @WebMethod void updateAlliance(String json);

    @WebMethod void deleteAlliance(String json);

    @WebMethod String getAlliances4corporationCreator_corporation(String json);

    @WebMethod void delete4corporationCreator_corporation(String json);

    @WebMethod String getAlliances4corporationExecutor_corporation(String json);

    @WebMethod void delete4corporationExecutor_corporation(String json);


}

