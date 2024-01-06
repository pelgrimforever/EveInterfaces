/*
 * Created on March 26, 2007, 5:44 PM
 * Generated on 31.11.2022 15:11
 * @author Franky Laseure
 */

package eve.interfaces.entity.pk;

import java.io.Serializable;
import data.interfaces.db.EntityPK;
import db.SQLparameters;

public interface IJson_ordersPK extends EntityPK, Serializable {

    public int getId();

    public void setId(int id);


    public boolean equals(IJson_ordersPK json_ordersPK2);

}
