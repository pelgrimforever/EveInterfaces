/*
 * Created on March 26, 2007, 5:44 PM
 * Generated on 31.11.2022 15:11
 * @author Franky Laseure
 */

package eve.interfaces.entity.pk;

import java.io.Serializable;
import data.interfaces.db.EntityPK;
import db.SQLparameters;

public interface IEveuserPK extends EntityPK, Serializable {

    public java.lang.String getUsername();

    public void setUsername(java.lang.String username);


    public boolean equals(IEveuserPK eveuserPK2);

}
