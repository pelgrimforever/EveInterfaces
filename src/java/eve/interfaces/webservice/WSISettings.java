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
public interface WSISettings {
    
    @WebMethod String getSettingss();

    @WebMethod String search(String json);

    @WebMethod String getSettings(String json);

    @WebMethod void insertSettings(String json);

    @WebMethod void updateSettings(String json);

    @WebMethod void deleteSettings(String json);

    @WebMethod String getSettingss4usersettings(String json);


}

