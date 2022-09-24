/*
 * Created on March 26, 2007, 5:44 PM
 * Generated on 23.8.2022 15:18
 * @author Franky Laseure
 */

package eve.interfaces.webservice;

import java.util.ArrayList;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT, use=SOAPBinding.Use.LITERAL)
public interface WSIRace {
    
    @WebMethod String getRaces();

    @WebMethod String search(String json);

    @WebMethod String getRace(String json);

    @WebMethod void insertRace(String json);

    @WebMethod void updateRace(String json);

    @WebMethod void deleteRace(String json);

    @WebMethod String getRaces4faction(String json);

    @WebMethod void delete4faction(String json);


}

