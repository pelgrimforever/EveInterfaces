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
public interface WSISystem {
    
    @WebMethod String getSystems();

    @WebMethod String search(String json);

    @WebMethod String getSystem(String json);

    @WebMethod void insertSystem(String json);

    @WebMethod void updateSystem(String json);

    @WebMethod void deleteSystem(String json);

    @WebMethod String getSystems4constellation(String json);

    @WebMethod void delete4constellation(String json);


}

