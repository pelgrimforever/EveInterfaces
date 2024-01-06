/*
 * Created on March 26, 2007, 5:44 PM
 * Generated on 31.11.2022 15:11
 * @author Franky Laseure
 */

package eve.interfaces.entity.pk;

import java.io.Serializable;
import data.interfaces.db.EntityPK;
import db.SQLparameters;

public interface IMarket_groupPK extends EntityPK, Serializable {

    public long getId();

    public void setId(long id);


    public boolean equals(IMarket_groupPK market_groupPK2);

}
