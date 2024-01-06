/*
 * Created on March 26, 2007, 5:44 PM
 * Generated on 31.11.2022 15:11
 * @author Franky Laseure
 */

package eve.interfaces.entity.pk;

import java.io.Serializable;
import data.interfaces.db.EntityPK;
import db.SQLparameters;

public interface IFrontendpagePK extends EntityPK, Serializable {

    public java.lang.String getName();

    public void setName(java.lang.String name);


    public boolean equals(IFrontendpagePK frontendpagePK2);

}
