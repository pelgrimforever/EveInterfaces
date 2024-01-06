/*
 * Created on March 26, 2007, 5:44 PM
 * Generated on 31.11.2022 15:11
 * @author Franky Laseure
 */

package eve.interfaces.entity.pk;

import java.io.Serializable;
import data.interfaces.db.EntityPK;
import db.SQLparameters;

public interface ITradecombinedPK extends EntityPK, Serializable {

    public IEvetypePK getEvetypePK();
    public void setEvetypePK(IEvetypePK evetypePK);

    public ISystemPK getSystembuy_systemPK();
    public void setSystembuy_systemPK(ISystemPK systemPK);

    public ISystemPK getSystemsell_systemPK();
    public void setSystemsell_systemPK(ISystemPK systemPK);

    public long getSell_system();

    public void setSell_system(long sell_system);

    public long getBuy_system();

    public void setBuy_system(long buy_system);

    public long getEvetype();

    public void setEvetype(long evetype);


    public boolean equals(ITradecombinedPK tradecombinedPK2);

}
