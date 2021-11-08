/*
 * WSITmp_system_jumps.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 8.10.2021 7:21
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
public interface WSITmp_system_jumps {
    
    @WebMethod String getTmp_system_jumpss();

    @WebMethod String search(String json);

    @WebMethod String getTmp_system_jumps(String json);

    @WebMethod void insertTmp_system_jumps(String json);

    @WebMethod void updateTmp_system_jumps(String json);

    @WebMethod void deleteTmp_system_jumps(String json);


}

