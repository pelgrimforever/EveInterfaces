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
public interface WSIFaction {
    
    @WebMethod String getFactions();

    @WebMethod String search(String json);

    @WebMethod String getFaction(String json);

    @WebMethod void insertFaction(String json);

    @WebMethod void updateFaction(String json);

    @WebMethod void deleteFaction(String json);

    @WebMethod String getFactions4system(String json);

    @WebMethod void delete4system(String json);


}

