/*
 * WSISettings.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 9.11.2021 14:30
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
public interface WSISettings {
    
    @WebMethod String getSettingss();

    @WebMethod String search(String json);

    @WebMethod String getSettings(String json);

    @WebMethod void insertSettings(String json);

    @WebMethod void updateSettings(String json);

    @WebMethod void deleteSettings(String json);

    @WebMethod String getSettingss4usersettings(String json);


}

