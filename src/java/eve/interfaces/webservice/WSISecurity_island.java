/*
 * WSISecurity_island.java
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
public interface WSISecurity_island {
    
    @WebMethod String getSecurity_islands();

    @WebMethod String search(String json);

    @WebMethod String getSecurity_island(String json);

    @WebMethod void insertSecurity_island(String json);

    @WebMethod void updateSecurity_island(String json);

    @WebMethod void deleteSecurity_island(String json);


}

