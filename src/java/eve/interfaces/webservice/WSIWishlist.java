/*
 * WSIWishlist.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 14.0.2022 16:56
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
public interface WSIWishlist {
    
    @WebMethod String getWishlists();

    @WebMethod String search(String json);

    @WebMethod String getWishlist(String json);

    @WebMethod void insertWishlist(String json);

    @WebMethod void updateWishlist(String json);

    @WebMethod void deleteWishlist(String json);

    @WebMethod String getWishlists4evetype(String json);

    @WebMethod void delete4evetype(String json);


}

