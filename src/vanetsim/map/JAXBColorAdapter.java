package vanetsim.map;

import java.awt.Color;

import javax.xml.bind.annotation.adapters.XmlAdapter;

/**
 * XmlAdapter to convert Color to Integer
 * 
 * @author &#64;wolfposd
 */
public class JAXBColorAdapter extends XmlAdapter<Integer, Color>
{

    @Override
    public Color unmarshal(Integer v) throws Exception
    {
        return new Color(v.intValue());
    }

    @Override
    public Integer marshal(Color v) throws Exception
    {
        return v.getRGB();
    }

}
