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

