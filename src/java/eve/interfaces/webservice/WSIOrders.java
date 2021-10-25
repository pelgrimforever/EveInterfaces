/*
 * WSIOrders.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 25.9.2021 15:16
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
public interface WSIOrders {
    
    @WebMethod String getOrderss();

    @WebMethod String search(String json);

    @WebMethod String getOrders(String json);

    @WebMethod void insertOrders(String json);

    @WebMethod void updateOrders(String json);

    @WebMethod void deleteOrders(String json);

    @WebMethod String getOrderss4evetype(String json);

    @WebMethod void delete4evetype(String json);

    @WebMethod String getOrderss4system(String json);

    @WebMethod void delete4system(String json);

    @WebMethod String getOrderss4systemtrade_orderBuy_order(String json);

    @WebMethod String getOrderss4systemtrade_orderSell_order(String json);

    @WebMethod String getOrderss4tradeSell_order_id(String json);

    @WebMethod String getOrderss4tradeBuy_order_id(String json);


}

