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
public interface WSICorporation {
    
    @WebMethod String getCorporations();

    @WebMethod String search(String json);

    @WebMethod String getCorporation(String json);

    @WebMethod void insertCorporation(String json);

    @WebMethod void updateCorporation(String json);

    @WebMethod void deleteCorporation(String json);

    @WebMethod String getCorporations4station(String json);

    @WebMethod void delete4station(String json);

    @WebMethod String getCorporations4faction(String json);

    @WebMethod void delete4faction(String json);

    @WebMethod String getCorporations4alliance(String json);

    @WebMethod void delete4alliance(String json);


}

