/*
 * WSISystemtrade_order.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 30.10.2021 10:3
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
public interface WSISystemtrade_order {
    
    @WebMethod String getSystemtrade_orders();

    @WebMethod String search(String json);

    @WebMethod String getSystemtrade_order(String json);

    @WebMethod void insertSystemtrade_order(String json);

    @WebMethod void updateSystemtrade_order(String json);

    @WebMethod void deleteSystemtrade_order(String json);

    @WebMethod String getSystemtrade_orders4ordersBuy_order(String json);

    @WebMethod void delete4ordersBuy_order(String json);

    @WebMethod String getSystemtrade_orders4ordersSell_order(String json);

    @WebMethod void delete4ordersSell_order(String json);

    @WebMethod String getSystemtrade_orders4systemtrade(String json);

    @WebMethod void delete4systemtrade(String json);


}

