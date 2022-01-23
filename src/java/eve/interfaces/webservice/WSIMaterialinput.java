/*
 * WSIMaterialinput.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 17.0.2022 13:37
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
public interface WSIMaterialinput {
    
    @WebMethod String getMaterialinputs();

    @WebMethod String search(String json);

    @WebMethod String getMaterialinput(String json);

    @WebMethod void insertMaterialinput(String json);

    @WebMethod void updateMaterialinput(String json);

    @WebMethod void deleteMaterialinput(String json);

    @WebMethod String getMaterialinputs4evetype(String json);

    @WebMethod void delete4evetype(String json);


}

