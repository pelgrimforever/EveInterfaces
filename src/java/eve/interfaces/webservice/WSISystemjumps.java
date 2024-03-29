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
public interface WSISystemjumps {
    
    @WebMethod String getSystemjumpss();

    @WebMethod String search(String json);

    @WebMethod String getSystemjumps(String json);

    @WebMethod void insertSystemjumps(String json);

    @WebMethod void updateSystemjumps(String json);

    @WebMethod void deleteSystemjumps(String json);

    @WebMethod String getSystemjumpss4systemSystem_end(String json);

    @WebMethod void delete4systemSystem_end(String json);

    @WebMethod String getSystemjumpss4systemSystem_start(String json);

    @WebMethod void delete4systemSystem_start(String json);


}

