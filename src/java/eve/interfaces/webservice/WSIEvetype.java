/*
 * WSIEvetype.java
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
public interface WSIEvetype {
    
    @WebMethod String getEvetypes();

    @WebMethod String search(String json);

    @WebMethod String getEvetype(String json);

    @WebMethod void insertEvetype(String json);

    @WebMethod void updateEvetype(String json);

    @WebMethod void deleteEvetype(String json);

    @WebMethod String getEvetypes4market_group(String json);

    @WebMethod void delete4market_group(String json);

    @WebMethod String getEvetypes4typegroup(String json);

    @WebMethod void delete4typegroup(String json);

    @WebMethod String getEvetypes4graphic(String json);

    @WebMethod void delete4graphic(String json);

    @WebMethod String getEvetypes4wishlist(String json);

    @WebMethod String getEvetypes4order_history_month(String json);

    @WebMethod String getEvetypes4stock(String json);

    @WebMethod String getEvetypes4order_history(String json);

    @WebMethod String getEvetypes4shipfitmodule(String json);

    @WebMethod String getEvetypes4shipfitorder(String json);

    @WebMethod String getEvetypes4tradecombined(String json);


}

