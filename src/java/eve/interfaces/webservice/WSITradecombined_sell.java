/*
 * WSITradecombined_sell.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 9.5.2022 11:11
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
public interface WSITradecombined_sell {
    
    @WebMethod String getTradecombined_sells();

    @WebMethod String search(String json);

    @WebMethod String getTradecombined_sell(String json);

    @WebMethod void insertTradecombined_sell(String json);

    @WebMethod void updateTradecombined_sell(String json);

    @WebMethod void deleteTradecombined_sell(String json);

    @WebMethod String getTradecombined_sells4ordersBuy_order_id(String json);

    @WebMethod void delete4ordersBuy_order_id(String json);

    @WebMethod String getTradecombined_sells4ordersSell_order_id(String json);

    @WebMethod void delete4ordersSell_order_id(String json);

    @WebMethod String getTradecombined_sells4tradecombined(String json);

    @WebMethod void delete4tradecombined(String json);


}

