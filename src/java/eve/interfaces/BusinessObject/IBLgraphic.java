/*
 * IBLgraphic.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 6.9.2021 16:29
 *
 */

package eve.interfaces.BusinessObject;

import java.io.Serializable;
import java.util.ArrayList;

import eve.entity.pk.*;
import eve.interfaces.logicentity.IGraphic;
import eve.interfaces.entity.pk.*;
import data.interfaces.db.Filedata;
import general.exception.CustomException;
import general.exception.DBException;
import general.exception.DataException;

/**
 * Business Logic Interface for Entity class Graphic
 * 
 * methods for manipulating data- and database objects
 * for Entity Graphic and direct related data
 * 
 * @author Franky Laseure
 */
public interface IBLgraphic extends Serializable {
	
    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Graphic()
     * @return new empty IGraphic object
     */
    public IGraphic newGraphic();
    
    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Graphic(primarykey fields)
     * @return new IGraphic object with initialized primary key
     */
    public IGraphic newGraphic(long id);

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new Graphic(IGraphicPK graphicPK)
     * @param graphicPK: primary key
     * @return new IGraphic object with initialized primary key
     */
    public IGraphic newGraphic(IGraphicPK graphicPK);

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new GraphicPK()
     * @return new empty IGraphicPK object
     */
    public IGraphicPK newGraphicPK();

    /**
     * For the moment not in use
     * Is made for the purpose of isolating logicentity objects completely from GUI
     * when required
     * Replaces new GraphicPK(primarykey fields)
     * @return new IGraphicPK object with initialized primary key
     */
    public IGraphicPK newGraphicPK(long id);

    /**
     * 
     * @return all Graphic objects from database, unsorted
     * @throws eve.general.exception.CustomException
     */
    public ArrayList getAll() throws CustomException;

    /**
     * 
     * @return all Graphic objects from database, customizable
     * @throws eve.general.exception.CustomException
     */
    public ArrayList getGraphics() throws CustomException;

    /**
     * 
     * @param graphicPK: Graphic primary key
     * @return Graphic Entity object for primary key
     * @throws eve.general.exception.CustomException
     */
    public IGraphic getGraphic(IGraphicPK graphicPK) throws CustomException;

    /**
     * Search graphic in database for graphicPK:
     * @param graphicPK: Graphic Primary Key, only valid for the initialized Entity
     * @return true if found in database
     * @throws DBException
     */
    public boolean getGraphicExists(IGraphicPK graphicPK) throws DBException;

    /**
     * try to insert Graphic object in database
     * commit transaction
     * @param graphic: Graphic Entity Object
     * @throws eve.general.exception.CustomException
     * @throws eve.general.exception.DataException
     */
    public void insertGraphic(IGraphic graphic) throws CustomException, DataException;

    /**
     * check if Graphic exists
     * insert if not, update if found
     * do not commit transaction
     * @param graphic: Graphic Entity Object
     * @throws eve.general.exception.CustomException
     * @throws eve.general.exception.DataException
     */
    public void insertupdateGraphic(IGraphic graphic) throws CustomException, DataException;

    /**
     * try to update Graphic object in database
     * commit transaction
     * @param graphic: Graphic Entity Object
     * @throws eve.general.exception.CustomException
     * @throws eve.general.exception.DataException
     */
    public void updateGraphic(IGraphic graphic) throws CustomException, DataException;
    
    /**
     * try to delete Graphic object in database
     * commit transaction
     * @param graphic: Graphic Entity Object
     * @throws eve.general.exception.CustomException
     */
    public void deleteGraphic(IGraphic graphic) throws CustomException;

    /**
     * try to insert Graphic object in database
     * do not commit transaction
     * @param graphic: Graphic Entity Object
     * @throws eve.general.exception.CustomException
     * @throws eve.general.exception.DataException
     */
    public void trans_insertGraphic(IGraphic graphic) throws CustomException, DataException;

    /**
     * try to update Graphic object in database
     * do not commit transaction
     * @param graphic: Graphic Entity Object
     * @throws eve.general.exception.CustomException
     * @throws eve.general.exception.DataException
     */
    public void trans_updateGraphic(IGraphic graphic) throws CustomException, DataException;
    
    /**
     * try to delete Graphic object in database
     * do not commit transaction
     * @param graphic: Graphic Entity Object
     * @throws eve.general.exception.CustomException
     */
    public void trans_deleteGraphic(IGraphic graphic) throws CustomException;
    
    
//Custom code, do not change this line
//Custom code, do not change this line

    /**
     * Commit transaction to database
     * @throws eve.general.exception.CustomException
     */
    public void Commit2DB() throws CustomException;

}
