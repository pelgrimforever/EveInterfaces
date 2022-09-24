/*
 * Created on March 26, 2007, 5:44 PM
 * Generated on 23.8.2022 15:18
 * @author Franky Laseure
 */

package eve.interfaces.entity.pk;

import java.io.Serializable;
import data.interfaces.db.EntityPK;
import db.SQLparameters;

public interface ISecurity_islandPK extends EntityPK, Serializable {

    public long getId();

    public void setId(long id);


    public boolean equals(ISecurity_islandPK security_islandPK2);

}
