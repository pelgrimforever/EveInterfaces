/*
 * Created on Feb 29, 2012, 18:15 PM
 * Generated on 31.11.2022 15:11
 * @author Franky Laseure
 */

package eve.searchentity;

import eve.interfaces.searchentity.IGraphicsearch;
import eve.interfaces.entity.pk.*;
import data.interfaces.db.*;
import eve.interfaces.logicentity.*;
import eve.interfaces.searchentity.*;
import eve.logicentity.Graphic;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

public class Graphicsearch extends Tablesearch implements IGraphicsearch {

    Numbersearch id = new Numbersearch("graphic.id");
    Stringsearch collision_file = new Stringsearch("graphic.collision_file");
    Stringsearch graphic_file = new Stringsearch("graphic.graphic_file");
    Stringsearch icon_folder = new Stringsearch("graphic.icon_folder");
    Stringsearch sof_dna = new Stringsearch("graphic.sof_dna");
    Stringsearch sof_fation_name = new Stringsearch("graphic.sof_fation_name");
    Stringsearch sof_hull_name = new Stringsearch("graphic.sof_hull_name");
    Stringsearch sof_race_name = new Stringsearch("graphic.sof_race_name");
//foreign keys
//external foreign keys

    public String getTable() {
        return Graphic.table;
    }

    public Graphicsearch() {
        setFieldsearchers();
    }

    public Graphicsearch(byte andor) {
        super(andor);
        setFieldsearchers();
    }

    private void setFieldsearchers() {
        addFieldsearcher(id);
        addFieldsearcher(collision_file);
        addFieldsearcher(graphic_file);
        addFieldsearcher(icon_folder);
        addFieldsearcher(sof_dna);
        addFieldsearcher(sof_fation_name);
        addFieldsearcher(sof_hull_name);
        addFieldsearcher(sof_race_name);
    }

    public void addPrimarykey(IGraphicPK graphicPK) {
        super.addPrimarykey(graphicPK);
    }

    public void id(long[] values, byte[] operators) {
        addNumbervalues(id, values, operators);
    }
    
    public void id(long[] values, byte[] operators, byte andor) {
        addNumbervalues(id, values, operators);
        id.setAndoroperator(andor);
    }
    
    public void collision_file(String[] values) {
        addStringvalues(collision_file, values);
    }
    
    public void collision_file(String[] values, byte compare, byte andor) {
        addStringvalues(collision_file, values);
        collision_file.setCompareoperator(compare);
        collision_file.setAndoroperator(andor);
    }
    
    public void graphic_file(String[] values) {
        addStringvalues(graphic_file, values);
    }
    
    public void graphic_file(String[] values, byte compare, byte andor) {
        addStringvalues(graphic_file, values);
        graphic_file.setCompareoperator(compare);
        graphic_file.setAndoroperator(andor);
    }
    
    public void icon_folder(String[] values) {
        addStringvalues(icon_folder, values);
    }
    
    public void icon_folder(String[] values, byte compare, byte andor) {
        addStringvalues(icon_folder, values);
        icon_folder.setCompareoperator(compare);
        icon_folder.setAndoroperator(andor);
    }
    
    public void sof_dna(String[] values) {
        addStringvalues(sof_dna, values);
    }
    
    public void sof_dna(String[] values, byte compare, byte andor) {
        addStringvalues(sof_dna, values);
        sof_dna.setCompareoperator(compare);
        sof_dna.setAndoroperator(andor);
    }
    
    public void sof_fation_name(String[] values) {
        addStringvalues(sof_fation_name, values);
    }
    
    public void sof_fation_name(String[] values, byte compare, byte andor) {
        addStringvalues(sof_fation_name, values);
        sof_fation_name.setCompareoperator(compare);
        sof_fation_name.setAndoroperator(andor);
    }
    
    public void sof_hull_name(String[] values) {
        addStringvalues(sof_hull_name, values);
    }
    
    public void sof_hull_name(String[] values, byte compare, byte andor) {
        addStringvalues(sof_hull_name, values);
        sof_hull_name.setCompareoperator(compare);
        sof_hull_name.setAndoroperator(andor);
    }
    
    public void sof_race_name(String[] values) {
        addStringvalues(sof_race_name, values);
    }
    
    public void sof_race_name(String[] values, byte compare, byte andor) {
        addStringvalues(sof_race_name, values);
        sof_race_name.setCompareoperator(compare);
        sof_race_name.setAndoroperator(andor);
    }
    
}
