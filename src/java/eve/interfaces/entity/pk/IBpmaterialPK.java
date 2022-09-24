/*
 * Created on March 26, 2007, 5:44 PM
 * Generated on 23.8.2022 15:18
 * @author Franky Laseure
 */

package eve.interfaces.entity.pk;

import java.io.Serializable;
import data.interfaces.db.EntityPK;
import db.SQLparameters;

public interface IBpmaterialPK extends EntityPK, Serializable {

    public IEvetypePK getEvetypebpPK();
    public void setEvetypebpPK(IEvetypePK evetypePK);

    public IEvetypePK getEvetypematerialPK();
    public void setEvetypematerialPK(IEvetypePK evetypePK);

    public long getBp();

    public void setBp(long bp);

    public long getMaterial();

    public void setMaterial(long material);


    public boolean equals(IBpmaterialPK bpmaterialPK2);

}
