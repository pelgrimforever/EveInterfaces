/*
 * WSIStation.java
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
public interface WSIStation {
    
    @WebMethod String getStations();

    @WebMethod String search(String json);

    @WebMethod String getStation(String json);

    @WebMethod void insertStation(String json);

    @WebMethod void updateStation(String json);

    @WebMethod void deleteStation(String json);

    @WebMethod String getStations4race(String json);

    @WebMethod void delete4race(String json);

    @WebMethod String getStations4evetype(String json);

    @WebMethod void delete4evetype(String json);

    @WebMethod String getStations4system(String json);

    @WebMethod void delete4system(String json);

    @WebMethod String getStations4station_service(String json);


}

