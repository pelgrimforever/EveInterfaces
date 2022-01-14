/*
 * WSIShipfit.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 14.0.2022 16:56
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

