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
public interface WSIShipfitorder {
    
    @WebMethod String getShipfitorders();

    @WebMethod String search(String json);

    @WebMethod String getShipfitorder(String json);

    @WebMethod void insertShipfitorder(String json);

    @WebMethod void updateShipfitorder(String json);

    @WebMethod void deleteShipfitorder(String json);

    @WebMethod String getShipfitorders4shipfit(String json);

    @WebMethod void delete4shipfit(String json);

    @WebMethod String getShipfitorders4evetype(String json);

    @WebMethod void delete4evetype(String json);

    @WebMethod String getShipfitorders4shipfitorderselected(String json);


}

