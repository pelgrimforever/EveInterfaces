/*
 * Created on March 26, 2007, 5:44 PM
 * Generated on 31.11.2022 15:11
 * @author Franky Laseure
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
        
    @Override
    public String getDbtool() {
        return eGraphic.databasetool;
    }
    
    @Override
    public String getConnectionpool() {
        return eGraphic.connectionpool;
    }
    
    public String getTable() { return table; }

    public String getClassName() { return this.getClass().getName(); };
	  
    public eGraphic() {
    }

    public eGraphic(long id) {
        this.graphicPK = new GraphicPK(id);
    }
  
    public eGraphic(GraphicPK graphicPK) {
        this.graphicPK = graphicPK;
    }

    public boolean isEmpty() {
        return this.graphicPK == null;
    }

    @Override
    public SQLparameters getSQLprimarykey() {
        return this.graphicPK.getSQLprimarykey();	  
    }
  
    @Override
    public Entityvalues getPrimarykeyvalues() {
        return this.graphicPK.getPrimarykeyvalues();	  
    }
  
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
	
    @Override
    public Object getKey() {
        return this.getPrimaryKey();
    }
  
    @Override
    public GraphicPK getPrimaryKey() {
        return this.graphicPK;
    }

    public java.lang.String getCollision_file() {
        return this.collision_file;
    }

    public void initCollision_file(java.lang.String collision_file) {
        this.collision_file = collision_file;
    }

    public void setCollision_file(java.lang.String collision_file) {
	if(collision_file==null && collision_file!=this.collision_file || collision_file!=null && !collision_file.equals(this.collision_file)) {
            updates.put(IGraphic.COLLISION_FILE, collision_file);
        }
        this.collision_file = collision_file;
    }

    public java.lang.String getGraphic_file() {
        return this.graphic_file;
    }

    public void initGraphic_file(java.lang.String graphic_file) {
        this.graphic_file = graphic_file;
    }

    public void setGraphic_file(java.lang.String graphic_file) {
	if(graphic_file==null && graphic_file!=this.graphic_file || graphic_file!=null && !graphic_file.equals(this.graphic_file)) {
            updates.put(IGraphic.GRAPHIC_FILE, graphic_file);
        }
        this.graphic_file = graphic_file;
    }

    public java.lang.String getIcon_folder() {
        return this.icon_folder;
    }

    public void initIcon_folder(java.lang.String icon_folder) {
        this.icon_folder = icon_folder;
    }

    public void setIcon_folder(java.lang.String icon_folder) {
	if(icon_folder==null && icon_folder!=this.icon_folder || icon_folder!=null && !icon_folder.equals(this.icon_folder)) {
            updates.put(IGraphic.ICON_FOLDER, icon_folder);
        }
        this.icon_folder = icon_folder;
    }

    public java.lang.String getSof_dna() {
        return this.sof_dna;
    }

    public void initSof_dna(java.lang.String sof_dna) {
        this.sof_dna = sof_dna;
    }

    public void setSof_dna(java.lang.String sof_dna) {
	if(sof_dna==null && sof_dna!=this.sof_dna || sof_dna!=null && !sof_dna.equals(this.sof_dna)) {
            updates.put(IGraphic.SOF_DNA, sof_dna);
        }
        this.sof_dna = sof_dna;
    }

    public java.lang.String getSof_fation_name() {
        return this.sof_fation_name;
    }

    public void initSof_fation_name(java.lang.String sof_fation_name) {
        this.sof_fation_name = sof_fation_name;
    }

    public void setSof_fation_name(java.lang.String sof_fation_name) {
	if(sof_fation_name==null && sof_fation_name!=this.sof_fation_name || sof_fation_name!=null && !sof_fation_name.equals(this.sof_fation_name)) {
            updates.put(IGraphic.SOF_FATION_NAME, sof_fation_name);
        }
        this.sof_fation_name = sof_fation_name;
    }

    public java.lang.String getSof_hull_name() {
        return this.sof_hull_name;
    }

    public void initSof_hull_name(java.lang.String sof_hull_name) {
        this.sof_hull_name = sof_hull_name;
    }

    public void setSof_hull_name(java.lang.String sof_hull_name) {
	if(sof_hull_name==null && sof_hull_name!=this.sof_hull_name || sof_hull_name!=null && !sof_hull_name.equals(this.sof_hull_name)) {
            updates.put(IGraphic.SOF_HULL_NAME, sof_hull_name);
        }
        this.sof_hull_name = sof_hull_name;
    }

    public java.lang.String getSof_race_name() {
        return this.sof_race_name;
    }

    public void initSof_race_name(java.lang.String sof_race_name) {
        this.sof_race_name = sof_race_name;
    }

    public void setSof_race_name(java.lang.String sof_race_name) {
	if(sof_race_name==null && sof_race_name!=this.sof_race_name || sof_race_name!=null && !sof_race_name.equals(this.sof_race_name)) {
            updates.put(IGraphic.SOF_RACE_NAME, sof_race_name);
        }
        this.sof_race_name = sof_race_name;
    }

    @Override
    public String toString() {
        return this.getPrimaryKey().getKeystring();
    }
}
