/*
 * Created on March 26, 2007, 5:44 PM
 * Generated on 23.8.2022 15:18
 * @author Franky Laseure
 */

package eve.interfaces.entity.pk;

import java.io.Serializable;
import data.interfaces.db.EntityPK;
import db.SQLparameters;

public interface IStockPK extends EntityPK, Serializable {

    public IEvetypePK getEvetypePK();
    public void setEvetypePK(IEvetypePK evetypePK);

    public long getEvetype();

    public void setEvetype(long evetype);

    public java.lang.String getUsername();

    public void setUsername(java.lang.String username);


    public boolean equals(IStockPK stockPK2);

}
