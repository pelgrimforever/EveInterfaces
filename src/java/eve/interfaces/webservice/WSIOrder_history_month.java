/*
 * WSIOrder_history_month.java
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
public interface WSIOrder_history_month {
    
    @WebMethod String getOrder_history_months();

    @WebMethod String search(String json);

    @WebMethod String getOrder_history_month(String json);

    @WebMethod void insertOrder_history_month(String json);

    @WebMethod void updateOrder_history_month(String json);

    @WebMethod void deleteOrder_history_month(String json);

    @WebMethod String getOrder_history_months4evetype(String json);

    @WebMethod void delete4evetype(String json);

    @WebMethod String getOrder_history_months4region(String json);

    @WebMethod void delete4region(String json);


}

