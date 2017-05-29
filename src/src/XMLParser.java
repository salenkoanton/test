import java.io.*;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.parsers.SAXParser;
import java.util.*;
/**
 * Created by Alpha on 29.05.2017.
 */
public class XMLParser {
    private List<FeedMessage> data;
    public XMLParser(InputStream toParse) throws IOException{
        try {
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser parser = factory.newSAXParser();
            XMLParseHandler saxp = new XMLParseHandler();
            parser.parse(toParse, saxp);
            data = saxp.getResult();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    public List<FeedMessage> getData(){
        return data;
    }
}
