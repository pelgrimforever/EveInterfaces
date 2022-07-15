/*
 * WSIBpmaterial.java
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
public interface WSIBpmaterial {
    
    @WebMethod String getBpmaterials();

    @WebMethod String search(String json);

    @WebMethod String getBpmaterial(String json);

    @WebMethod void insertBpmaterial(String json);

    @WebMethod void updateBpmaterial(String json);

    @WebMethod void deleteBpmaterial(String json);

    @WebMethod String getBpmaterials4evetypeBp(String json);

    @WebMethod void delete4evetypeBp(String json);

    @WebMethod String getBpmaterials4evetypeMaterial(String json);

    @WebMethod void delete4evetypeMaterial(String json);


}

