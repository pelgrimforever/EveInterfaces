/*
 * Created on March 26, 2007, 5:44 PM
 * Generated on 31.11.2022 15:11
 * @author Franky Laseure
 */

package eve.interfaces.entity.pk;

import java.io.Serializable;
import data.interfaces.db.EntityPK;
import db.SQLparameters;

public interface ITradePK extends EntityPK, Serializable {

    public IOrdersPK getOrderssell_order_idPK();
    public void setOrderssell_order_idPK(IOrdersPK ordersPK);

    public IOrdersPK getOrdersbuy_order_idPK();
    public void setOrdersbuy_order_idPK(IOrdersPK ordersPK);

    public long getSell_order_id();

    public void setSell_order_id(long sell_order_id);

    public long getBuy_order_id();

    public void setBuy_order_id(long buy_order_id);


    public boolean equals(ITradePK tradePK2);

}
