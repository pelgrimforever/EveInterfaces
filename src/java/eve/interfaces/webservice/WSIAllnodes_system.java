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
public interface WSIAllnodes_system {
    
    @WebMethod String getAllnodes_systems();

    @WebMethod String search(String json);

    @WebMethod String getAllnodes_system(String json);

    @WebMethod void insertAllnodes_system(String json);

    @WebMethod void updateAllnodes_system(String json);

    @WebMethod void deleteAllnodes_system(String json);


}

