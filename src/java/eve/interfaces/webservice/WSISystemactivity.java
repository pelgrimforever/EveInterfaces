/*
 * WSISystemactivity.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 5.3.2022 17:21
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
public interface WSISystemactivity {
    
    @WebMethod String getSystemactivitys();

    @WebMethod String search(String json);

    @WebMethod String getSystemactivity(String json);

    @WebMethod void insertSystemactivity(String json);

    @WebMethod void updateSystemactivity(String json);

    @WebMethod void deleteSystemactivity(String json);

    @WebMethod String getSystemactivitys4system(String json);

    @WebMethod void delete4system(String json);


}

