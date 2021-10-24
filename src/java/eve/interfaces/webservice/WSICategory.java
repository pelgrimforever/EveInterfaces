/*
 * WSICategory.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 24.9.2021 14:40
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
public interface WSICategory {
    
    @WebMethod String getCategorys();

    @WebMethod String search(String json);

    @WebMethod String getCategory(String json);

    @WebMethod void insertCategory(String json);

    @WebMethod void updateCategory(String json);

    @WebMethod void deleteCategory(String json);


}

