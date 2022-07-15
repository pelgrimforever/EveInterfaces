/*
 * WSIUserbp.java
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
public interface WSIUserbp {
    
    @WebMethod String getUserbps();

    @WebMethod String search(String json);

    @WebMethod String getUserbp(String json);

    @WebMethod void insertUserbp(String json);

    @WebMethod void updateUserbp(String json);

    @WebMethod void deleteUserbp(String json);

    @WebMethod String getUserbps4evetype(String json);

    @WebMethod void delete4evetype(String json);


}

