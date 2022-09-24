/*
 * Created on March 26, 2007, 5:44 PM
 * Generated on 23.8.2022 15:18
 * @author Franky Laseure
 */

package eve.interfaces.entity.pk;

import java.io.Serializable;
import data.interfaces.db.EntityPK;
import db.SQLparameters;

public interface IStocktradePK extends EntityPK, Serializable {

    public IStockPK getStockPK();
    public void setStockPK(IStockPK stockPK);

    public java.lang.String getUsername();

    public void setUsername(java.lang.String username);

    public long getEvetype();

    public void setEvetype(long evetype);

    public long getOrderid();

    public void setOrderid(long orderid);


    public boolean equals(IStocktradePK stocktradePK2);

}
