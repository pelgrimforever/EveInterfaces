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
public interface WSIShipfitorderselected {
    
    @WebMethod String getShipfitorderselecteds();

    @WebMethod String search(String json);

    @WebMethod String getShipfitorderselected(String json);

    @WebMethod void insertShipfitorderselected(String json);

    @WebMethod void updateShipfitorderselected(String json);

    @WebMethod void deleteShipfitorderselected(String json);

    @WebMethod String getShipfitorderselecteds4orders(String json);

    @WebMethod void delete4orders(String json);

    @WebMethod String getShipfitorderselecteds4shipfitorder(String json);

    @WebMethod void delete4shipfitorder(String json);


}

