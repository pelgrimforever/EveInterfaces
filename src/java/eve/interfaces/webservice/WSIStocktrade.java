/*
 * WSIStocktrade.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 16.11.2021 15:45
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
public interface WSIStocktrade {
    
    @WebMethod String getStocktrades();

    @WebMethod String search(String json);

    @WebMethod String getStocktrade(String json);

    @WebMethod void insertStocktrade(String json);

    @WebMethod void updateStocktrade(String json);

    @WebMethod void deleteStocktrade(String json);

    @WebMethod String getStocktrades4stock(String json);

    @WebMethod void delete4stock(String json);


}

