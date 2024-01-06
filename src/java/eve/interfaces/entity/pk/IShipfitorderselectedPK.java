/*
 * Created on March 26, 2007, 5:44 PM
 * Generated on 31.11.2022 15:11
 * @author Franky Laseure
 */

package eve.interfaces.entity.pk;

import java.io.Serializable;
import data.interfaces.db.EntityPK;
import db.SQLparameters;

public interface IShipfitorderselectedPK extends EntityPK, Serializable {

    public IOrdersPK getOrdersPK();
    public void setOrdersPK(IOrdersPK ordersPK);

    public IShipfitorderPK getShipfitorderPK();
    public void setShipfitorderPK(IShipfitorderPK shipfitorderPK);

    public java.lang.String getUsername();

    public void setUsername(java.lang.String username);

    public java.lang.String getShipname();

    public void setShipname(java.lang.String shipname);

    public long getEvetype();

    public void setEvetype(long evetype);

    public long getOrderid();

    public void setOrderid(long orderid);


    public boolean equals(IShipfitorderselectedPK shipfitorderselectedPK2);

}
