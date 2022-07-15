/*
 * WSIContractitem.java
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
public interface WSIContractitem {
    
    @WebMethod String getContractitems();

    @WebMethod String search(String json);

    @WebMethod String getContractitem(String json);

    @WebMethod void insertContractitem(String json);

    @WebMethod void updateContractitem(String json);

    @WebMethod void deleteContractitem(String json);

    @WebMethod String getContractitems4evetype(String json);

    @WebMethod void delete4evetype(String json);

    @WebMethod String getContractitems4contract(String json);

    @WebMethod void delete4contract(String json);


}

