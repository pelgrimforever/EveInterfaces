/*
 * WSIShipfitorderselected.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 20.11.2021 17:22
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

