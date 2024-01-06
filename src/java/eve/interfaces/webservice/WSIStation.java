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

