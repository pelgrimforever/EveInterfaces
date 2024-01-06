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
public interface WSIRoutetype {
    
    @WebMethod String getRoutetypes();

    @WebMethod String search(String json);

    @WebMethod String getRoutetype(String json);

    @WebMethod void insertRoutetype(String json);

    @WebMethod void updateRoutetype(String json);

    @WebMethod void deleteRoutetype(String json);

    @WebMethod String getRoutetypes4security_island(String json);

    @WebMethod void delete4security_island(String json);


}

