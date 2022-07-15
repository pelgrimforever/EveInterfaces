/*
 * WSITypegroup.java
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
public interface WSITypegroup {
    
    @WebMethod String getTypegroups();

    @WebMethod String search(String json);

    @WebMethod String getTypegroup(String json);

    @WebMethod void insertTypegroup(String json);

    @WebMethod void updateTypegroup(String json);

    @WebMethod void deleteTypegroup(String json);

    @WebMethod String getTypegroups4category(String json);

    @WebMethod void delete4category(String json);


}

