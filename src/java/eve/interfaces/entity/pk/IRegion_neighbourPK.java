/*
 * Created on March 26, 2007, 5:44 PM
 * Generated on 31.11.2022 15:11
 * @author Franky Laseure
 */

package eve.interfaces.entity.pk;

import java.io.Serializable;
import data.interfaces.db.EntityPK;
import db.SQLparameters;

public interface IRegion_neighbourPK extends EntityPK, Serializable {

    public IRegionPK getRegionregionPK();
    public void setRegionregionPK(IRegionPK regionPK);

    public IRegionPK getRegionneighbourPK();
    public void setRegionneighbourPK(IRegionPK regionPK);

    public long getRegion();

    public void setRegion(long region);

    public long getNeighbour();

    public void setNeighbour(long neighbour);


    public boolean equals(IRegion_neighbourPK region_neighbourPK2);

}
