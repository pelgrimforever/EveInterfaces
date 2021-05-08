package eve.conversion.xml;

import XML.XMLElement;
import java.io.IOException;
import object.Objectoperation;
import data.conversion.JSONConversion;
import data.gis.shape.GISConversion;
import data.interfaces.db.EntityPKInterface;
import data.interfaces.db.IFieldsearcher;
import eve.entity.pk.RacePK;
import eve.interfaces.entity.pk.IRacePK;
import eve.logicentity.Race;
import eve.searchentity.*;
import java.sql.Date;
import java.sql.Time;
import java.util.Iterator;
import org.jdom2.Element;

/**
 *
 * @author Franky Laseure
 */
public class XMLRace {
    
    /**
     * 
     * @return all keys and fields as XML
     */
    public static void addXML(Element PK, IRacePK racePK) {
        PK.addContent(XMLElement.newContent("id", racePK.getId()));
    }

    /**
     * 
     * @return all keys and fields in a JSONObject
     */
    public static void addXML(Element RaceXML, Race race) {
        Element PK = XMLElement.newContent("PK", "");
        addXML(PK, race.getPrimaryKey());
        RaceXML.addContent(PK);
        RaceXML.addContent(XMLElement.newContent("name", race.getName()));
        RaceXML.addContent(XMLElement.newContent("description", race.getDescription()));
        RaceXML.addContent(XMLElement.newContent("alliance", race.getAlliance()));
    }
}

