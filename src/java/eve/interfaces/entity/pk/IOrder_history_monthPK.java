/*
 * Created on March 26, 2007, 5:44 PM
 * Generated on 31.11.2022 15:11
 * @author Franky Laseure
 */

package eve.interfaces.entity.pk;

import java.io.Serializable;
import data.interfaces.db.EntityPK;
import db.SQLparameters;

public interface IOrder_history_monthPK extends EntityPK, Serializable {

    public IEvetypePK getEvetypePK();
    public void setEvetypePK(IEvetypePK evetypePK);

    public IRegionPK getRegionPK();
    public void setRegionPK(IRegionPK regionPK);

    public long getRegion();

    public void setRegion(long region);

    public long getEvetype();

    public void setEvetype(long evetype);

    public int getYear();

    public void setYear(int year);

    public int getMonth();

    public void setMonth(int month);


    public boolean equals(IOrder_history_monthPK order_history_monthPK2);

}
