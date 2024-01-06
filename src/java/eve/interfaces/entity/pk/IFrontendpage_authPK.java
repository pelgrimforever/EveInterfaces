/*
 * Created on March 26, 2007, 5:44 PM
 * Generated on 31.11.2022 15:11
 * @author Franky Laseure
 */

package eve.interfaces.entity.pk;

import java.io.Serializable;
import data.interfaces.db.EntityPK;
import db.SQLparameters;

public interface IFrontendpage_authPK extends EntityPK, Serializable {

    public IFrontendpagePK getFrontendpagePK();
    public void setFrontendpagePK(IFrontendpagePK frontendpagePK);

    public IEveuserPK getEveuserPK();
    public void setEveuserPK(IEveuserPK eveuserPK);

    public java.lang.String getUsername();

    public void setUsername(java.lang.String username);

    public java.lang.String getFrontendpage();

    public void setFrontendpage(java.lang.String frontendpage);


    public boolean equals(IFrontendpage_authPK frontendpage_authPK2);

}
