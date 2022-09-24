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

