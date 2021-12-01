/*
 * WSIGraphic.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 30.10.2021 10:3
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
public interface WSIGraphic {
    
    @WebMethod String getGraphics();

    @WebMethod String search(String json);

    @WebMethod String getGraphic(String json);

    @WebMethod void insertGraphic(String json);

    @WebMethod void updateGraphic(String json);

    @WebMethod void deleteGraphic(String json);


}

