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
public interface WSIRegion {
    
    @WebMethod String getRegions();

    @WebMethod String search(String json);

    @WebMethod String getRegion(String json);

    @WebMethod void insertRegion(String json);

    @WebMethod void updateRegion(String json);

    @WebMethod void deleteRegion(String json);


}

