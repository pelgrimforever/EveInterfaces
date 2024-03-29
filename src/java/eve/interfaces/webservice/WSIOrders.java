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

    @WebMethod String getOrderss4tradecombined_sellBuy_order_id(String json);

    @WebMethod String getOrderss4tradecombined_sellSell_order_id(String json);

    @WebMethod String getOrderss4shipfitorderselected(String json);

    @WebMethod String getOrderss4tradeSell_order_id(String json);

    @WebMethod String getOrderss4tradeBuy_order_id(String json);


}

