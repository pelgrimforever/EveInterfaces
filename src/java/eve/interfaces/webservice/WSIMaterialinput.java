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

