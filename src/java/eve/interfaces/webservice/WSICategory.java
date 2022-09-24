/*
 * Created on March 26, 2007, 5:44 PM
 * Generated on 23.8.2022 15:18
 * @author Franky Laseure
 */

package eve.interfaces.webservice;

import java.util.ArrayList;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

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

