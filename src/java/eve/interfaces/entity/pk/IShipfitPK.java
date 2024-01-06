/*
 * Created on March 26, 2007, 5:44 PM
 * Generated on 31.11.2022 15:11
 * @author Franky Laseure
 */

package eve.interfaces.entity.pk;

import java.io.Serializable;
import data.interfaces.db.EntityPK;
import db.SQLparameters;

public interface IShipfitPK extends EntityPK, Serializable {

    public java.lang.String getUsername();

    public void setUsername(java.lang.String username);

    public java.lang.String getShipname();

    public void setShipname(java.lang.String shipname);


    public boolean equals(IShipfitPK shipfitPK2);

}
