/*
 * WSITrade.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 4.11.2021 14:51
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
public interface WSITrade {
    
    @WebMethod String getTrades();

    @WebMethod String search(String json);

    @WebMethod String getTrade(String json);

    @WebMethod void insertTrade(String json);

    @WebMethod void updateTrade(String json);

    @WebMethod void deleteTrade(String json);

    @WebMethod String getTrades4ordersSell_order_id(String json);

    @WebMethod void delete4ordersSell_order_id(String json);

    @WebMethod String getTrades4ordersBuy_order_id(String json);

    @WebMethod void delete4ordersBuy_order_id(String json);


}

