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
public interface WSIShipfitmodule {
    
    @WebMethod String getShipfitmodules();

    @WebMethod String search(String json);

    @WebMethod String getShipfitmodule(String json);

    @WebMethod void insertShipfitmodule(String json);

    @WebMethod void updateShipfitmodule(String json);

    @WebMethod void deleteShipfitmodule(String json);

    @WebMethod String getShipfitmodules4evetype(String json);

    @WebMethod void delete4evetype(String json);

    @WebMethod String getShipfitmodules4shipfit(String json);

    @WebMethod void delete4shipfit(String json);


}

