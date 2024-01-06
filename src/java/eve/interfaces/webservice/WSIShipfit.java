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
public interface WSIShipfit {
    
    @WebMethod String getShipfits();

    @WebMethod String search(String json);

    @WebMethod String getShipfit(String json);

    @WebMethod void insertShipfit(String json);

    @WebMethod void updateShipfit(String json);

    @WebMethod void deleteShipfit(String json);

    @WebMethod String getShipfits4evetype(String json);

    @WebMethod void delete4evetype(String json);

    @WebMethod String getShipfits4shipfitmodule(String json);

    @WebMethod String getShipfits4shipfitorder(String json);


}

