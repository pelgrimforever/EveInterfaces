/*
 * WSIMarket_group.java
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
public interface WSIMarket_group {
    
    @WebMethod String getMarket_groups();

    @WebMethod String search(String json);

    @WebMethod String getMarket_group(String json);

    @WebMethod void insertMarket_group(String json);

    @WebMethod void updateMarket_group(String json);

    @WebMethod void deleteMarket_group(String json);

    @WebMethod String getMarket_groups4market_groupParent_id(String json);

    @WebMethod void delete4market_groupParent_id(String json);


}

