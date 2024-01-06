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

