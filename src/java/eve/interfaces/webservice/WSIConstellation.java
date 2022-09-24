/*
 * Created on March 26, 2007, 5:44 PM
 * Generated on 23.8.2022 15:18
 * @author Franky Laseure
 */

package eve.interfaces.webservice;

import java.util.ArrayList;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT, use=SOAPBinding.Use.LITERAL)
public interface WSIConstellation {
    
    @WebMethod String getConstellations();

    @WebMethod String search(String json);

    @WebMethod String getConstellation(String json);

    @WebMethod void insertConstellation(String json);

    @WebMethod void updateConstellation(String json);

    @WebMethod void deleteConstellation(String json);

    @WebMethod String getConstellations4region(String json);

    @WebMethod void delete4region(String json);

    @WebMethod String getConstellations4constellation_neighbourNeighbour(String json);

    @WebMethod String getConstellations4constellation_neighbourConstellation(String json);


}

