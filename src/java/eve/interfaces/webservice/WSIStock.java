/*
 * WSIStock.java
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
public interface WSIStock {
    
    @WebMethod String getStocks();

    @WebMethod String search(String json);

    @WebMethod String getStock(String json);

    @WebMethod void insertStock(String json);

    @WebMethod void updateStock(String json);

    @WebMethod void deleteStock(String json);

    @WebMethod String getStocks4evetype(String json);

    @WebMethod void delete4evetype(String json);

    @WebMethod String getStocks4stocktrade(String json);


}

