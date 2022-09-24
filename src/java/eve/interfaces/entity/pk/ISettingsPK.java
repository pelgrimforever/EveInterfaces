/*
 * Created on March 26, 2007, 5:44 PM
 * Generated on 23.8.2022 15:18
 * @author Franky Laseure
 */

package eve.interfaces.entity.pk;

import java.io.Serializable;
import data.interfaces.db.EntityPK;
import db.SQLparameters;

public interface ISettingsPK extends EntityPK, Serializable {

    public java.lang.String getName();

    public void setName(java.lang.String name);


    public boolean equals(ISettingsPK settingsPK2);

}
