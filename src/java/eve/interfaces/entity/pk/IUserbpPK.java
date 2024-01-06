/*
 * Created on March 26, 2007, 5:44 PM
 * Generated on 31.11.2022 15:11
 * @author Franky Laseure
 */

package eve.interfaces.entity.pk;

import java.io.Serializable;
import data.interfaces.db.EntityPK;
import db.SQLparameters;

public interface IUserbpPK extends EntityPK, Serializable {

    public IEvetypePK getEvetypePK();
    public void setEvetypePK(IEvetypePK evetypePK);

    public long getBp();

    public void setBp(long bp);

    public java.lang.String getUsername();

    public void setUsername(java.lang.String username);

    public int getSerialnumber();

    public void setSerialnumber(int serialnumber);


    public boolean equals(IUserbpPK userbpPK2);

}
