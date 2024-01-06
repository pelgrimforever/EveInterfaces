/*
 * Created on March 26, 2007, 5:44 PM
 * Generated on 31.11.2022 15:11
 * @author Franky Laseure
 */

package eve.interfaces.webservice;

import java.util.ArrayList;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT, use=SOAPBinding.Use.LITERAL)
public interface WSIStation_service {
    
    @WebMethod String getStation_services();

    @WebMethod String search(String json);

    @WebMethod String getStation_service(String json);

    @WebMethod void insertStation_service(String json);

    @WebMethod void updateStation_service(String json);

    @WebMethod void deleteStation_service(String json);

    @WebMethod String getStation_services4station(String json);

    @WebMethod void delete4station(String json);


}

