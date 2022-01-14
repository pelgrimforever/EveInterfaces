/*
 * eGraphic.java
 *
 * Created on March 26, 2007, 5:44 PM
 * Generated on 14.0.2022 16:56
 *
 */

package eve.entity;

import eve.eveDatabaseproperties;
import data.interfaces.db.AbstractEntity;
import data.interfaces.db.Entity;
import data.interfaces.db.Filedata;
import data.gis.shape.*;
import data.json.piJson;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Iterator;

import eve.entity.pk.*;
import eve.interfaces.logicentity.IGraphic;
import eve.interfaces.entity.pk.*;
import db.Entityvalues;
import db.SQLparameters;

/**
 * Entity class Graphic
 * 
 * Attributes: primary key, foreign keys en fields
 * Attributes: Database independent SQL-construction strings
 * Conversion methods for java.sql.ResultSet ==> Graphic Entity
 * 
 * @author Franky Laseure
 */
public class eGraphic extends AbstractEntity implements eveDatabaseproperties, Entity {

    protected GraphicPK graphicPK;
    private java.lang.String collision_file;
    private java.lang.String graphic_file;
    private java.lang.String icon_folder;
    private java.lang.String sof_dna;
    private java.lang.String sof_fation_name;
    private java.lang.String sof_hull_name;
    private java.lang.String sof_race_name;
	  
    public static final String table = "graphic";
	  
    public String getFieldname(short fieldconstant) {
        return IGraphic.fieldnames[fieldconstant-1];
    }
        
    public byte getFieldtype(short fieldconstant) {
        return IGraphic.fieldtypes[fieldconstant-1];
    }
        
    /**
     * @return database tool name
     */
    @Override
    public String getDbtool() {
        return eGraphic.databasetool;
    }
    
    /**
     * @return connection pool name
     */
    @Override
    public String getConnectionpool() {
        return eGraphic.connectionpool;
    }
    
    /**
     * 
     * @return table name for Graphic
     */
    public String getTable() { return table; }

    /**
     * 
     * @return Graphic class name
     */
    public String getClassName() { return this.getClass().getName(); };
	  
    /** 
     * Constructor
     * Creates an empty Graphic entity
     */
    public eGraphic() {
    }

    /**
     * Constructor
     * build an empty Graphic entity with initialized field values
     */
    public eGraphic(long id) {
        this.graphicPK = new GraphicPK(id);
    }
  
    /**
     * Constructor
     * build an empty Graphic entity with initialized Primarykey parameter
     * @param graphicPK: Graphic Primarykey
     */
    public eGraphic(GraphicPK graphicPK) {
        this.graphicPK = graphicPK;
    }

    /**
     * @return is Graphic Empty ?
     */
    public boolean isEmpty() {
        return this.graphicPK == null;
    }

    /**
     * 
     * @return primarykey fields (fieldname, value) as a SQLparameters object
     */
    @Override
    public SQLparameters getSQLprimarykey() {
        return this.graphicPK.getSQLprimarykey();	  
    }
  
    /**
     * 
     * @return primarykey fields (fieldreference, value) as Entityvalues
     */
    @Override
    public Entityvalues getPrimarykeyvalues() {
        return this.graphicPK.getPrimarykeyvalues();	  
    }
  
    /**
     * 
     * @return all fields (fieldname, value)
     */
    @Override
    public Entityvalues getAll() {
        updates.put(IGraphic.COLLISION_FILE, collision_file);
        updates.put(IGraphic.GRAPHIC_FILE, graphic_file);
        updates.put(IGraphic.ICON_FOLDER, icon_folder);
        updates.put(IGraphic.SOF_DNA, sof_dna);
        updates.put(IGraphic.SOF_FATION_NAME, sof_fation_name);
        updates.put(IGraphic.SOF_HULL_NAME, sof_hull_name);
        updates.put(IGraphic.SOF_RACE_NAME, sof_race_name);
        return getAllFields();
    }
	
    /**
     * @return GraphicPK
     */
    @Override
    public Object getKey() {
        return this.getPrimaryKey();
    }
  
    /**
     * @return GraphicPK
     */
    @Override
    public GraphicPK getPrimaryKey() {
        return this.graphicPK;
    }

    /**
     * 
     * @return collision_file value
     */
    public java.lang.String getCollision_file() {
        return this.collision_file;
    }

    /**
     * set collision_file value
     * @param collision_file: new value
     */
    public void initCollision_file(java.lang.String collision_file) {
        this.collision_file = collision_file;
    }

    /**
     * set collision_file value
     * @param collision_file: new value
     */
    public void setCollision_file(java.lang.String collision_file) {
	if(collision_file==null && collision_file!=this.collision_file || collision_file!=null && !collision_file.equals(this.collision_file)) {
            updates.put(IGraphic.COLLISION_FILE, collision_file);
        }
        this.collision_file = collision_file;
    }

    /**
     * 
     * @return graphic_file value
     */
    public java.lang.String getGraphic_file() {
        return this.graphic_file;
    }

    /**
     * set graphic_file value
     * @param graphic_file: new value
     */
    public void initGraphic_file(java.lang.String graphic_file) {
        this.graphic_file = graphic_file;
    }

    /**
     * set graphic_file value
     * @param graphic_file: new value
     */
    public void setGraphic_file(java.lang.String graphic_file) {
	if(graphic_file==null && graphic_file!=this.graphic_file || graphic_file!=null && !graphic_file.equals(this.graphic_file)) {
            updates.put(IGraphic.GRAPHIC_FILE, graphic_file);
        }
        this.graphic_file = graphic_file;
    }

    /**
     * 
     * @return icon_folder value
     */
    public java.lang.String getIcon_folder() {
        return this.icon_folder;
    }

    /**
     * set icon_folder value
     * @param icon_folder: new value
     */
    public void initIcon_folder(java.lang.String icon_folder) {
        this.icon_folder = icon_folder;
    }

    /**
     * set icon_folder value
     * @param icon_folder: new value
     */
    public void setIcon_folder(java.lang.String icon_folder) {
	if(icon_folder==null && icon_folder!=this.icon_folder || icon_folder!=null && !icon_folder.equals(this.icon_folder)) {
            updates.put(IGraphic.ICON_FOLDER, icon_folder);
        }
        this.icon_folder = icon_folder;
    }

    /**
     * 
     * @return sof_dna value
     */
    public java.lang.String getSof_dna() {
        return this.sof_dna;
    }

    /**
     * set sof_dna value
     * @param sof_dna: new value
     */
    public void initSof_dna(java.lang.String sof_dna) {
        this.sof_dna = sof_dna;
    }

    /**
     * set sof_dna value
     * @param sof_dna: new value
     */
    public void setSof_dna(java.lang.String sof_dna) {
	if(sof_dna==null && sof_dna!=this.sof_dna || sof_dna!=null && !sof_dna.equals(this.sof_dna)) {
            updates.put(IGraphic.SOF_DNA, sof_dna);
        }
        this.sof_dna = sof_dna;
    }

    /**
     * 
     * @return sof_fation_name value
     */
    public java.lang.String getSof_fation_name() {
        return this.sof_fation_name;
    }

    /**
     * set sof_fation_name value
     * @param sof_fation_name: new value
     */
    public void initSof_fation_name(java.lang.String sof_fation_name) {
        this.sof_fation_name = sof_fation_name;
    }

    /**
     * set sof_fation_name value
     * @param sof_fation_name: new value
     */
    public void setSof_fation_name(java.lang.String sof_fation_name) {
	if(sof_fation_name==null && sof_fation_name!=this.sof_fation_name || sof_fation_name!=null && !sof_fation_name.equals(this.sof_fation_name)) {
            updates.put(IGraphic.SOF_FATION_NAME, sof_fation_name);
        }
        this.sof_fation_name = sof_fation_name;
    }

    /**
     * 
     * @return sof_hull_name value
     */
    public java.lang.String getSof_hull_name() {
        return this.sof_hull_name;
    }

    /**
     * set sof_hull_name value
     * @param sof_hull_name: new value
     */
    public void initSof_hull_name(java.lang.String sof_hull_name) {
        this.sof_hull_name = sof_hull_name;
    }

    /**
     * set sof_hull_name value
     * @param sof_hull_name: new value
     */
    public void setSof_hull_name(java.lang.String sof_hull_name) {
	if(sof_hull_name==null && sof_hull_name!=this.sof_hull_name || sof_hull_name!=null && !sof_hull_name.equals(this.sof_hull_name)) {
            updates.put(IGraphic.SOF_HULL_NAME, sof_hull_name);
        }
        this.sof_hull_name = sof_hull_name;
    }

    /**
     * 
     * @return sof_race_name value
     */
    public java.lang.String getSof_race_name() {
        return this.sof_race_name;
    }

    /**
     * set sof_race_name value
     * @param sof_race_name: new value
     */
    public void initSof_race_name(java.lang.String sof_race_name) {
        this.sof_race_name = sof_race_name;
    }

    /**
     * set sof_race_name value
     * @param sof_race_name: new value
     */
    public void setSof_race_name(java.lang.String sof_race_name) {
	if(sof_race_name==null && sof_race_name!=this.sof_race_name || sof_race_name!=null && !sof_race_name.equals(this.sof_race_name)) {
            updates.put(IGraphic.SOF_RACE_NAME, sof_race_name);
        }
        this.sof_race_name = sof_race_name;
    }

    /**
     * 
     * @return Primarykey string value
     */
    @Override
    public String toString() {
        return this.getPrimaryKey().getKeystring();
    }
}
