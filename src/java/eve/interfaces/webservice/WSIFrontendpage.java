/*
 * WSIFrontendpage.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 9.5.2022 11:11
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
public interface WSIFrontendpage {
    
    @WebMethod String getFrontendpages();

    @WebMethod String search(String json);

    @WebMethod String getFrontendpage(String json);

    @WebMethod void insertFrontendpage(String json);

    @WebMethod void updateFrontendpage(String json);

    @WebMethod void deleteFrontendpage(String json);

    @WebMethod String getFrontendpages4frontendpage_auth(String json);


}

