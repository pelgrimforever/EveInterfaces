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
public interface WSIFrontendpage_auth {
    
    @WebMethod String getFrontendpage_auths();

    @WebMethod String search(String json);

    @WebMethod String getFrontendpage_auth(String json);

    @WebMethod void insertFrontendpage_auth(String json);

    @WebMethod void updateFrontendpage_auth(String json);

    @WebMethod void deleteFrontendpage_auth(String json);

    @WebMethod String getFrontendpage_auths4frontendpage(String json);

    @WebMethod void delete4frontendpage(String json);

    @WebMethod String getFrontendpage_auths4eveuser(String json);

    @WebMethod void delete4eveuser(String json);


}

