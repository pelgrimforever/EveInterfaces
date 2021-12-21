/*
 * WSIRegion_neighbour.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 16.11.2021 15:45
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
public interface WSIRegion_neighbour {
    
    @WebMethod String getRegion_neighbours();

    @WebMethod String search(String json);

    @WebMethod String getRegion_neighbour(String json);

    @WebMethod void insertRegion_neighbour(String json);

    @WebMethod void updateRegion_neighbour(String json);

    @WebMethod void deleteRegion_neighbour(String json);

    @WebMethod String getRegion_neighbours4regionRegion(String json);

    @WebMethod void delete4regionRegion(String json);

    @WebMethod String getRegion_neighbours4regionNeighbour(String json);

    @WebMethod void delete4regionNeighbour(String json);


}

