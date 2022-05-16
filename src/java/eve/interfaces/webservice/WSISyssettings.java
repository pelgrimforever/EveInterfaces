/*
 * WSISyssettings.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 11.4.2022 9:13
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
public interface WSISyssettings {
    
    @WebMethod String getSyssettingss();

    @WebMethod String search(String json);

    @WebMethod String getSyssettings(String json);

    @WebMethod void insertSyssettings(String json);

    @WebMethod void updateSyssettings(String json);

    @WebMethod void deleteSyssettings(String json);


}

