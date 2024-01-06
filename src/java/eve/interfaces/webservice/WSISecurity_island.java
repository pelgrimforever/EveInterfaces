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
public interface WSISecurity_island {
    
    @WebMethod String getSecurity_islands();

    @WebMethod String search(String json);

    @WebMethod String getSecurity_island(String json);

    @WebMethod void insertSecurity_island(String json);

    @WebMethod void updateSecurity_island(String json);

    @WebMethod void deleteSecurity_island(String json);


}

