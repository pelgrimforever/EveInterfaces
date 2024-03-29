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
public interface WSIConstellation_neighbour {
    
    @WebMethod String getConstellation_neighbours();

    @WebMethod String search(String json);

    @WebMethod String getConstellation_neighbour(String json);

    @WebMethod void insertConstellation_neighbour(String json);

    @WebMethod void updateConstellation_neighbour(String json);

    @WebMethod void deleteConstellation_neighbour(String json);

    @WebMethod String getConstellation_neighbours4constellationNeighbour(String json);

    @WebMethod void delete4constellationNeighbour(String json);

    @WebMethod String getConstellation_neighbours4constellationConstellation(String json);

    @WebMethod void delete4constellationConstellation(String json);


}

