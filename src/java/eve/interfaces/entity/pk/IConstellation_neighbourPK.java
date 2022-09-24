/*
 * Created on March 26, 2007, 5:44 PM
 * Generated on 23.8.2022 15:18
 * @author Franky Laseure
 */

package eve.interfaces.entity.pk;

import java.io.Serializable;
import data.interfaces.db.EntityPK;
import db.SQLparameters;

public interface IConstellation_neighbourPK extends EntityPK, Serializable {

    public IConstellationPK getConstellationneighbourPK();
    public void setConstellationneighbourPK(IConstellationPK constellationPK);

    public IConstellationPK getConstellationconstellationPK();
    public void setConstellationconstellationPK(IConstellationPK constellationPK);

    public long getConstellation();

    public void setConstellation(long constellation);

    public long getNeighbour();

    public void setNeighbour(long neighbour);


    public boolean equals(IConstellation_neighbourPK constellation_neighbourPK2);

}
