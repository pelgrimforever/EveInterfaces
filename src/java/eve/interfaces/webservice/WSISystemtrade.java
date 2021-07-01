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
public interface WSISystemtrade {
    
    @WebMethod String getSystemtrades();

    @WebMethod String search(String json);

    @WebMethod String getSystemtrade(String json);

    @WebMethod void insertSystemtrade(String json);

    @WebMethod void updateSystemtrade(String json);

    @WebMethod void deleteSystemtrade(String json);

    @WebMethod String getSystemtrades4systemSell_system(String json);

    @WebMethod void delete4systemSell_system(String json);

    @WebMethod String getSystemtrades4systemBuy_system(String json);

    @WebMethod void delete4systemBuy_system(String json);

    @WebMethod String getSystemtrades4systemtrade_order(String json);


}

