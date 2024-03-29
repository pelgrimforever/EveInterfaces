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
public interface WSITradecombined {
    
    @WebMethod String getTradecombineds();

    @WebMethod String search(String json);

    @WebMethod String getTradecombined(String json);

    @WebMethod void insertTradecombined(String json);

    @WebMethod void updateTradecombined(String json);

    @WebMethod void deleteTradecombined(String json);

    @WebMethod String getTradecombineds4evetype(String json);

    @WebMethod void delete4evetype(String json);

    @WebMethod String getTradecombineds4systemBuy_system(String json);

    @WebMethod void delete4systemBuy_system(String json);

    @WebMethod String getTradecombineds4systemSell_system(String json);

    @WebMethod void delete4systemSell_system(String json);

    @WebMethod String getTradecombineds4tradecombined_sell(String json);


}

