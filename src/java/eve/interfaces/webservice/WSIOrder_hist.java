/*
 * WSIOrder_hist.java
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
public interface WSIOrder_hist {
    
    @WebMethod String getOrder_hists();

    @WebMethod String search(String json);

    @WebMethod String getOrder_hist(String json);

    @WebMethod void insertOrder_hist(String json);

    @WebMethod void updateOrder_hist(String json);

    @WebMethod void deleteOrder_hist(String json);

    @WebMethod String getOrder_hists4evetype(String json);

    @WebMethod void delete4evetype(String json);

    @WebMethod String getOrder_hists4system(String json);

    @WebMethod void delete4system(String json);


}

