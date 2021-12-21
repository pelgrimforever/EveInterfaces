/*
 * WSIUsersettings.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 16.11.2021 15:45
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
public interface WSIUsersettings {
    
    @WebMethod String getUsersettingss();

    @WebMethod String search(String json);

    @WebMethod String getUsersettings(String json);

    @WebMethod void insertUsersettings(String json);

    @WebMethod void updateUsersettings(String json);

    @WebMethod void deleteUsersettings(String json);

    @WebMethod String getUsersettingss4settings(String json);

    @WebMethod void delete4settings(String json);


}

